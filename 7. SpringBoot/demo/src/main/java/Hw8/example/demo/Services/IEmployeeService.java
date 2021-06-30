package Hw8.example.demo.Services;

import Hw8.example.demo.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService<Employee> {

    public abstract List<Employee> findAll();

    public abstract Optional<Employee> get(long id);

    public abstract void add(Employee t);

    public abstract void update(Employee t);

    public abstract void deleteByID(long id);

    public abstract void delete(Employee t);

}
