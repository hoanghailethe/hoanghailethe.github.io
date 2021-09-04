package com.peopleManager.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String fullName;
    private String job;
    String gender;
    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    String birthDate;
}
