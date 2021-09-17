package com.TechmasterHW30.JPA.h2.Junit.Entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="person")
@Table(name="person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name="full_name")
    private String fullName;
    @Column
    private String gender;
    @Column
    private String job;
    @Column
    private String city;
    @Column
    private float salary;
}
