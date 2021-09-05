package com.EmployeeWeb.demo.configureDatabase;

import com.EmployeeWeb.demo.Services.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.EmployeeWeb.demo")
public class EmployeedataConfigure {
    @Bean("DataService")
    public EmployeeService employeeManager() {
        return new EmployeeService();
    }

}
