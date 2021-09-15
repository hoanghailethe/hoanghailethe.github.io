package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findById(long id);
    Optional<Customer> findByEmail(String email);
    List<Customer> findByJob(String job);
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}
