package com.TechmasterHW30.JPA.h2.Junit.QueryModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AvgSalaryGroupCity {
    String city;
    double avgSalary;
}
