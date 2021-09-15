package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DataJpaTest
@Sql({"/data.sql"})
@Slf4j
public class CustomerTest {
    @Autowired
    CustomerRepository customerRepo;

    // Tim khach hang co Id = 99;
    @Test
    public void findById() {
        Customer cus1 = customerRepo.findById(99L).get();
        System.out.print("Customer id 99: ");
        System.out.println(cus1);
        assertThat(cus1.getId()).isEqualTo(99L);
    }

    // Tim khach hang co email = "JohnSmith@";
    @Test
    public void findByEmail(){
        Customer cus2 = customerRepo.findByEmail("egrouer8@ameblo.jp").get();
        System.out.print("Customer who has email: egrouer8@ameblo.jp ");
        System.out.println(cus2);
        assertThat(cus2.getEmail()).isEqualTo("egrouer8@ameblo.jp");
    }


    // Tim danh sach khach hang firstname = " John"
    @Test
    public void findByFirstName(){
        System.out.print("Customers who has FN as JOHN ");
        List<Customer> customersJohn = customerRepo.findByFirstName("John");
        customersJohn.forEach(System.out::println);
        assertThat(customersJohn.size()).isGreaterThan(2);
    }

    // Tim danh sach khach hang lastname = " Grubey"
    @Test
    public void findByLastName(){
        System.out.print("Customer who has LN as Grubey ");
        List<Customer> customersLName = customerRepo.findByFirstName("Grubey");
        customersLName.forEach(System.out::println);
        assertThat(customersLName.size()).isGreaterThan(1);
    }

    // Tim danh sach khach hang job = "Cost Accountant"
    public void findByJob(){
        System.out.print("Customers work as Cost Accountant");
        List<Customer> findByJob = customerRepo.findByFirstName("Cost Accountant");
        findByJob.forEach(System.out::println);
        assertThat(findByJob.size()).isGreaterThan(5);
    }
}
