package com.peopleManager.demo.Repositories;

import com.peopleManager.demo.Models.Job;
import com.peopleManager.demo.Models.Person;
import com.peopleManager.demo.Request.PersonRequest;
import com.peopleManager.demo.service.StorageService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PeopleRepository{
    ArrayList<Person> people = new ArrayList<>();
    int idPeople;
    Set<String> jobs = new HashSet<>();

    @Autowired
    StorageService imgStore;

    public PeopleRepository() {
        jobs.add("lập trình viên");
        jobs.add("Tester");
        jobs.add("Tổng thống");
        jobs.add("Võ sư");
        jobs.add("Chụp ảnh viên");
        jobs.add("Thám tử");
        jobs.add("Actor");
        jobs.add("Footballer");

        people.add(new Person(1, "Tom Cruise", "Tomcruise@gmail.com", "Actor", "Male", "03/27/1987"));
        people.add(new Person(2, "Lionel Messi","messi@gmail.com", "Footballer", "Male", "03/03/1985"));
        people.add(new Person(3, "De Paul","dePaul@gmail.com", "Actor", "Male", "07/03/1987"));

        idPeople = people.size();
    }

    public Set<String> getJobsList() {
        return jobs;
    }

    //ADD&DELETE  JOB
    public void addJob(Job job) {
        jobs.add(job.getJobName());
    }
    public void deleteJob(String job) {
        jobs.remove(job);
    }

    public void savePerson(PersonRequest personRequest) {
        System.out.println(personRequest);
        ModelMapper modelMapper = new ModelMapper();
        Person person = modelMapper.map(personRequest, Person.class);
        person.setId( ++idPeople );
        people.add(person);
        imgStore.uploadFile(personRequest.getPhoto(), idPeople);
    }

    public PersonRequest editPersonById(int id) {
        Person person = getById(id).isPresent() ? getById(id).get() : new Person();
        ModelMapper modelMapper = new ModelMapper();
        PersonRequest personRequest= modelMapper.map(person, PersonRequest.class);
        return personRequest;
    }

    public List<Person> getAllPeople(){
        return people;
    }

    public void deleteById(int id) {
        getById(id).ifPresent(t -> people.remove(t));
    }

    public Optional<Person> getById(int id) {
        Optional<Person> find = people.stream().filter( t -> t.getId()== id).findFirst();
        return find;
    }


    public void editPerson(PersonRequest person) {
        Person personEdit = getById(person.getId()).get();
        personEdit.setFullName(person.getFullName());
        personEdit.setEmail(person.getEmail());
        personEdit.setGender(person.getGender());
        personEdit.setBirthDate(person.getBirthDate());
        personEdit.setJob(person.getJob());
        if(person.getPhoto().getOriginalFilename().isEmpty() == false) {
            imgStore.uploadFile(person.getPhoto(), person.getId());
        }
        System.out.println(people);
    }
}