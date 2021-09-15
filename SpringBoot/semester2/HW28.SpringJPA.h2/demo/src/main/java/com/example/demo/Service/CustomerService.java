package com.example.demo.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepo;

    Optional<Customer> findById(long id){
        return customerRepo.findById(id);
    };
    Optional<Customer> findByEmail(String email) {
        return customerRepo.findByEmail(email);
    };
    List<Customer> findByJob(String job){
        return customerRepo.findByJob(job);
    };
    List<Customer> findByFirstName(String firstName){
        return customerRepo.findByFirstName(firstName);
    };
    List<Customer> findByLastName(String lastName){
        return customerRepo.findByLastName(lastName);
    };
}
