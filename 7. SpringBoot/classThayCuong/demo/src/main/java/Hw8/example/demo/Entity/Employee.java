package Hw8.example.demo.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "employee")
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(nullable = false, name = "FIRSTNAME")
    private String firstName;
    @Column(nullable = false, name = "LASTNAME")
    private String lastName;
    @Column(nullable = false, name = "EMAIL")
    private String email;


}
