package Hw8.example.demo.Respository;

import Hw8.example.demo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Ko dc co @respository o day
public interface EmployeeRespository
        extends JpaRepository<Employee, Long> {

}
