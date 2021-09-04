package Hw8.example.demo.Services;

import Hw8.example.demo.Entity.Employee;
import Hw8.example.demo.Respository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService<Employee>{
    @Autowired
    EmployeeRespository employeeDatabase;

    @Override
    public List<Employee> findAll() {
        return employeeDatabase.findAll();
    }

    @Override
    public Optional<Employee> get(long id) {
        return employeeDatabase.findAll().stream().filter( e -> e.getId() == id).findFirst();
    }

//    https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
    @Override
    public void add(Employee employee) {
        employeeDatabase.save(employee);
    }

    @Override
    public void update(Employee t) {
        get(t.getId()).ifPresent(e -> {
            e.setFirstName(t.getFirstName());
            e.setLastName(t.getLastName());
            e.setEmail(t.getEmail());
        });
    }

    @Override
    public void deleteByID(long id) {
        get(id).ifPresent( e -> employeeDatabase.delete(e));
    }

    @Override
    public void delete(Employee e) {
        employeeDatabase.delete(e);
    }
}
