package com.manage.employeeManager.Repository;

import com.manage.employeeManager.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
