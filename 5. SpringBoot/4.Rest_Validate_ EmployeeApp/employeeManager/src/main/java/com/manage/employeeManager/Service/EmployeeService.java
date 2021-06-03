package com.manage.employeeManager.Service;

import com.manage.employeeManager.Employee.Employee;
import com.manage.employeeManager.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public List<Employee> findByEmailId(String emailId) {
        return employeeRepo.findAll().stream().filter(employee -> employee.getEmailId().equals(emailId)).collect(Collectors.toList());
    }


}
