package com.object;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private String name;
    private double gpa;
    private String email;
    private String city;

    public Student(int id, String name, double gpa, String email, String city) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.email = email;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
