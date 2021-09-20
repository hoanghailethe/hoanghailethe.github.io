package com.peopleManager.demo.Controllers;

import com.peopleManager.demo.Models.Job;
import com.peopleManager.demo.Repositories.PeopleRepository;
import com.peopleManager.demo.Request.PersonRequest;
import com.peopleManager.demo.exception.StorageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Locale;

@org.springframework.stereotype.Controller
public class ControllerPeopleAndJobs {

    @Autowired
    private PeopleRepository peopleRepo;

    @Autowired
    private MessageSource messageSource;

    final String ImgResource = "/photos/";

    @GetMapping("/jobList")
    public String addJobs(Model model){
        model.addAttribute("newJob", new Job());
        model.addAttribute("jobs", peopleRepo.getJobsList());
        return "listJobs";
    }

    @PostMapping("/jobList")
    public String addAJob(@ModelAttribute Job newJob, Model model){
        peopleRepo.addJob(newJob);
        model.addAttribute("newJob", new Job());
        model.addAttribute("jobs", peopleRepo.getJobsList());
        return "listJobs";
    }

    @GetMapping("/home")
    public String showAllPeople(Model model){
        model.addAttribute("people", peopleRepo.getAllPeople());
        model.addAttribute("path", ImgResource);
        return "home";
    }

    @GetMapping("/delete/person/{id}")
    public String deleteAPerson(@PathVariable int id, Model model) {
        peopleRepo.deleteById(id);
        return "redirect:/home";
    }

    @GetMapping("/delete/{job}")
    public String deleteAJob(@PathVariable String job, Model model) {
        peopleRepo.deleteJob(job);
        model.addAttribute("newJob", new Job());
        model.addAttribute("jobs", peopleRepo.getJobsList());
        return "redirect:/jobList";
    }

    @GetMapping("/edit/person/{id}")
    public String editAPerson(@PathVariable int id, Model model) {
        PersonRequest personRequest = peopleRepo.editPersonById(id);
        System.out.println(personRequest);
        model.addAttribute("person", personRequest);
        model.addAttribute("jobs", peopleRepo.getJobsList());
        return "register";
    }

    @GetMapping("/register")
    public String addNewPerson(Model model){
        model.addAttribute("person", new PersonRequest());
        model.addAttribute("jobs", peopleRepo.getJobsList());
        return "register";
    }

    @PostMapping(value="/addOrUpdate", consumes = {"multipart/form-data"})
    //bindingResult phai de ngay sau thang @valid. neu ko se ko binding dc eror
    public String sendNewPersonForm (@Valid @ModelAttribute("person") PersonRequest person, BindingResult result, Model model) throws Exception {
        //tao ra doi tuong locale
        Locale locale = LocaleContextHolder.getLocale();

        if (person.getPhoto().getOriginalFilename().isEmpty()) {
            result.addError(new FieldError("person", "photo",
                    //change from previous Exercise - default message:
                    messageSource.getMessage("photo.required", null, "Photo required", locale)));
        }
        if (result.hasErrors()) {
            //System.out.println(result.getAllErrors());
            //hien thi lai trang de bao loi
            model.addAttribute("jobs", peopleRepo.getJobsList());
            return "register";
        }
        if(person.getId() == 0) {
            peopleRepo.savePerson(person);
        } else {
            peopleRepo.editPerson(person);
        }
        model.addAttribute("people", peopleRepo.getAllPeople());
        model.addAttribute("path", ImgResource);
        return "home";
    }

    //add to pre
    //add to handle upload file bi loi
    @ExceptionHandler(StorageException.class)
    public String handleStorageFileNotFound(StorageException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "failure";
    }

}
