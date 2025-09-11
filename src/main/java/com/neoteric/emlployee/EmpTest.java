package com.neoteric.emlployee;

import java.util.List;
import java.util.Set;

public class EmpTest {
    public static void main(String[] args) {


        EmpService empService = new EmpService();
        Set<Employee> employeeSet = empService.getEmployee();
        for (Employee emp : employeeSet) {
            System.out.println(emp);

        }
    }
}
