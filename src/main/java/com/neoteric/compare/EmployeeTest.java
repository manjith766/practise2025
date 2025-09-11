package com.neoteric.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(4,"mam",10000));
        employees.add(new Employee(2,"raju",4000));
        employees.add(new Employee(3,"radha",10000));
        employees.add(new Employee(1,"mamu",8000));


        Comparator<Employee>bysalaryThenName=(e1,e2)->{
            if (e1.salary == e2.salary){
                return e1.name.compareTo(e2.name);
            }else {
                return Double.compare(e1.salary, e2.salary);
            }
        };



        Collections.sort(employees,bysalaryThenName);
        for (Employee e : employees)
            System.out.println(e);


    }

}
