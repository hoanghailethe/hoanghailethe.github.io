package com.manage.employeeManager.Controller;

import com.manage.employeeManager.Employee.Employee;
import com.manage.employeeManager.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/employee") @Controller
public class EmployeeRequestController {
    @Autowired
    private EmployeeService employeeManager;

    @GetMapping("/{EmailId}")
    public ResponseEntity<List<Employee>> getbyEmailId(@PathVariable String EmailId){
        List<Employee> employees = (EmailId == null) ? employeeManager.findAll() : employeeManager.findByEmailId(EmailId);
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/querryByEmail")
    public ResponseEntity<List<Employee>> getbyParameters(@RequestParam(required = false) String emailId){
        //return "email ID la: " + emailId;
        List<Employee> employees = (emailId == null) ? employeeManager.findAll() : employeeManager.findByEmailId(emailId);
        return ResponseEntity.ok(employees);
    }
}
