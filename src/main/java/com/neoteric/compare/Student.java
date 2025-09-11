package com.neoteric.compare;

public class Student  implements  Comparable<Student>{
    int id;
    String name;


    Student(int id,String name){
        this.id=id;
        this.name= name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
}
