package com.codegym.ss9.model;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private Float point;
    private LocalDate dob;

    public Student() {
    }

    public Student(Integer id, String name, String email, Float point, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.point = point;
        this.dob = dob;
    }

    public Student(String name, String email, Float point, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.point = point;
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
