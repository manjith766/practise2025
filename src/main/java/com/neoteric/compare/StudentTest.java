package com.neoteric.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        List<Student>studentList = new ArrayList<Student>();
        studentList.add(new Student(2,"ram"));
        studentList.add(new Student(2,"raju"));
        studentList.add(new Student(1,"anil"));
        studentList.add(new Student(4,"anil"));

        Collections.sort(studentList);
        System.out.println("by id"+studentList);

        Comparator<Student>byname= (s1,s2)->s1.name.compareTo(s2.name);
        Collections.sort(studentList,byname);
        System.out.println("byname"+studentList);

    }
}
