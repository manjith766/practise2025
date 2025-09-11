package com.neoteric.emlployee;

import java.util.Date;
import java.util.Objects;

public class Employee {

    private String id;
    private String name;
    private double salary;
    private Date date;

    public Employee(String id, String name, double salary, Date date) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
