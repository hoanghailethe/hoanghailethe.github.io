package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity (name="customer")
@Table(name="customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    //https://stackoverflow.com/questions/35646432/org-h2-jdbc-jdbcsqlexception-column-salman-not-found/35646785
    //column not found errs
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="job")
    private String job;
}
