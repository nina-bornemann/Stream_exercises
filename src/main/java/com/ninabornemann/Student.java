package com.ninabornemann;

public class Student {

    int id;
    String name;
    int postalCode;
    int age;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postalCode=" + postalCode +
                ", age=" + age +
                '}';
    }
}
