package com.peopleManager.demo.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {
    private int id;
    @NotBlank(message = "your name is required")
    @Size(min = 5, max = 30, message = "Name must between 5 and 30")
    private String fullName;

    @NotBlank(message = "your job is required")
    private String job;
    String gender;

    @NotBlank(message = "your birthday is required")
    String birthDate;
    private MultipartFile photo;

    @Override
    public String toString() {
        return "PersonRequest{id" + id +
                " fullName='" + fullName + '\'' +
                ", job='" + job + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\''+
                "photo : " + photo +
                '}';
    }
}
