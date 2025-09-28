package com.neoteric.Streams.Map;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR", 60000));
        employees.add(new Employee("Naveen", "HR", 16000));
        employees.add(new Employee("Raju", "HR", 20000));
        employees.add(new Employee("Mallika", "HR", 80000));
        employees.add(new Employee("David", "IT", 70000));
        employees.add(new Employee("Bob", "IT", 25000));
        employees.add(new Employee("Eve", "IT", 30000));
        employees.add(new Employee("Frank", "IT", 40000));
        employees.add(new Employee("Charlie", "Finance", 15000));
        employees.add(new Employee("Grace", "Finance", 35000));
        employees.add(new Employee("Heidi", "Finance", 45000));
        employees.add(new Employee("Ivan", "Finance", 55000));


        Map<String, Optional<Employee>> highestSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));
        highestSalaryByDept.forEach((dept, emp) -> {
            System.out.println("Department: " + dept + ", Employee with highest salary: " + emp.orElse(null));
        });

        Map<String,Double>avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        avgSalaryByDept.forEach((dept, avgSalary) -> {
            System.out.println("Department: " + dept + ", Average Salary: " + avgSalary);
        });

        double avgSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Overall Average Salary: " + avgSalary);

        Optional<Employee>minSalaryEmp = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employee with Minimum Salary: " + minSalaryEmp.orElse(null));




    }
}
