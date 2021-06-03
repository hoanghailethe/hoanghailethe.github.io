package com.manage.employeeManager.Service;

import com.manage.employeeManager.Employee.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> findAll();
    List<Employee> findByEmailId(String emailId);

//    Optional<Employee> findById(Long id);
//
//    Employee save(Employee employee);
//
//    void update(long id, Employee employee);
//
//    void updateTitle(long id, String title);
//
//    void deleteById(long id);

}
