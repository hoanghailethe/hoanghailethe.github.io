package com.manage.employeeManager.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "Employee")
@Table(name = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "FIRSTNAME")
    private String firstName;

    @Column(nullable = false, name = "LASTNAME")
    private String lastName;

    @Column(nullable = false, name = "EMAILID")
    @NotBlank @Email
    private String emailId;

    @NotNull @Column(nullable = false, name = "PRIVATENUMBER")
    private String privateNumber;


}
