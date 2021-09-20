package com.peopleManager.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    @NotBlank(message="{name_blank}")
    private String fullName;
    @Email(message="{email.invalid}") @NotBlank(message="{email_blank}")
    private String email;
    private String job;
    String gender;
    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    String birthDate;

}
