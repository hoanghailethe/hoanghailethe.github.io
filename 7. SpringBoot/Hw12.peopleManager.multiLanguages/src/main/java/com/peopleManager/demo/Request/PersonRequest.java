package com.peopleManager.demo.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {
    private int id;
    @NotBlank(message = "{name_blank}")
    @Size(min = 5, max = 30, message = "{name_size_between_5_30}")
    private String fullName;

    @NotBlank(message = "{email_blank}")
    @Email(message = "{email_invalid}")
    private String email;

    @NotBlank(message = "your job is required")
    private String job;
    String gender;

    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotBlank(message = "{birthDate_blank}")
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
