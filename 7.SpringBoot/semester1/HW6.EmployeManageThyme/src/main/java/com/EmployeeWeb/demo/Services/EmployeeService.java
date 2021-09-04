package com.EmployeeWeb.demo.Services;

import com.EmployeeWeb.demo.Entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//phai bo service di vi da tu tao bean trong configure
//@Repository
public class EmployeeService extends IEmployeeService <Employee>{
    protected List<Employee> collection = new ArrayList<>();

    public EmployeeService(){
        this.addData();
    }

    @Override
    public void addData() {
        collection.add(new Employee(1, "Duong", "Le", "lethamduong@gmail.com"));
        collection.add(new Employee(2, "Huy", "Nguyen", "lehuyduong@gmail.com"));
        collection.add(new Employee(3, "Hoang", "Trung", "hoangTrung@gmail.com"));
        collection.add(new Employee(4, "Luu", "Bi", "lethamduong@gmail.com"));
        collection.add(new Employee(5, "Duong", "Le", "lethamduong@gmail.com"));
        collection.add(new Employee(6, "Thuy", "Duyen", "nghuytuog@gmail.com"));
    }

    @Override
    public List<Employee> findAll() {
        return collection;
    }

    @Override
    public Optional<Employee> get(long id) {
        return collection.stream().filter(u -> u.getId() == id).findFirst();
    }


    @Override
    public void add(Employee employee) {
        long id = 0;
        if(collection.isEmpty()) {
            id = 1;
        } else {
            id = collection.size();
        }
        employee.setId(id);
        collection.add(employee);
    }

    @Override
    public void update(Employee employee) {
        get(employee.getId()).ifPresent( e -> {
                e.setFirstName(employee.getFirstName());
                e.setLastName(employee.getLastName());
                e.setEmail(employee.getEmail());

        });
    }

    @Override
    public void deleteByID(long id) {
        get(id).ifPresent( e -> collection.remove(e));
    }

    @Override
    public void delete(Employee employee) {
            deleteByID(employee.getId());
    }


}
