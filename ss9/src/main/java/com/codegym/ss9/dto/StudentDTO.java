package com.codegym.ss9.dto;

import java.time.LocalDate;

public class StudentDTO {
    private Integer id;
    private String name;
    private String email;
    private Float point;
    private LocalDate dob;
    private String nameClass;

    public StudentDTO() {
    }

    public StudentDTO(Integer id, String name, String email, Float point, LocalDate dob, String nameClass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.point = point;
        this.dob = dob;
        this.nameClass = nameClass;
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

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}
