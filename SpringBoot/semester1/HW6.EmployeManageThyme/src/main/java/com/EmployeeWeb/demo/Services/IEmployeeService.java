package com.EmployeeWeb.demo.Services;


import java.util.List;
import java.util.Optional;

public abstract class IEmployeeService<T> {
    public abstract void addData();

    public abstract List<T> findAll();

    public abstract Optional<T> get(long id);

    public abstract void add(T t);

    public abstract void update(T t);

    public abstract void deleteByID(long id);

    public abstract void delete(T t);

}
