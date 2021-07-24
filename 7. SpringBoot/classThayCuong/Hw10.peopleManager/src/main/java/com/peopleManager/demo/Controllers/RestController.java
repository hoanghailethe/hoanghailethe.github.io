package com.peopleManager.demo.Controllers;

import com.peopleManager.demo.Models.Job;
import com.peopleManager.demo.Repositories.PeopleRepository;
import com.peopleManager.demo.Request.PersonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class RestController {

    @Autowired
    PeopleRepository peopleRepo;

    final String ImgResource = "/photos/";

    @GetMapping("/register")
    public String addNewPerson(Model model){
        model.addAttribute("person", new PersonRequest());
        model.addAttribute("jobs", peopleRepo.getJobsList());
        return "register";
    }

    @PostMapping(value="/addOrUpdate", consumes = {"multipart/form-data"})
    public String sendNewPersonForm (@Valid @ModelAttribute("person") PersonRequest person, Model model, BindingResult result) throws Exception {
        if (person.getPhoto().getOriginalFilename().isEmpty()) {
            result.addError(new FieldError("person", "photo", "Photo is required"));
        }
        if (result.hasErrors()) {
            System.out.println(result.getAllErrors());
            //hien thi lai trang de bao loi
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

    @GetMapping("/edit/person/{id}")
    public String editAPerson(@PathVariable int id, Model model) {
        PersonRequest personRequest = peopleRepo.editPersonById(id);
        System.out.println(personRequest);
        model.addAttribute("person", personRequest);
        model.addAttribute("jobs", peopleRepo.getJobsList());
        return "register";
    }

    @GetMapping("/delete/{job}")
    public String deleteAJob(@PathVariable String job, Model model) {
        peopleRepo.deleteJob(job);
        model.addAttribute("newJob", new Job());
        model.addAttribute("jobs", peopleRepo.getJobsList());
        return "redirect:/jobList";
    }

}
