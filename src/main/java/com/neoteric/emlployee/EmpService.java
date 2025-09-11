package com.neoteric.emlployee;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class EmpService {

    public Set<Employee> getEmployee(){

        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("2", "john", 20000, new Date()));
        employees.add(new Employee("3", "ram", 20000, new Date()));
        employees.add(new Employee("4", "mahesh", 30000, new Date()));
        employees.add(new Employee("5", "ssss", 30000, new Date()));
        employees.add(new Employee("2", "john", 20000, new Date()));

        System.out.println("employee set size"+employees.size());

        return employees;

    }
}
