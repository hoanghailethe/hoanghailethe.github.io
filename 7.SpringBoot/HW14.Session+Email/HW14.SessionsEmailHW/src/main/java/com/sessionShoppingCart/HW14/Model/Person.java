package com.sessionShoppingCart.HW14.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    String birthDate;
}


