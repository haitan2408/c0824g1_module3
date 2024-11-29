package com.codegym.ss9.repository;

import com.codegym.ss9.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Trương Tấn Hải", "hai.truong@codegym.vn", 8.0f, LocalDate.now()));
        students.add(new Student(2, "Trương Tấn Hải", "hai.truong@codegym.vn", 8.0f, LocalDate.now()));
        students.add(new Student(3, "Trương Tấn Hải", "hai.truong@codegym.vn", 8.0f, LocalDate.now()));
    }

    public List<Student> findAll() {
        return students;
    }

    public void save(Student s) {

        s.setId(students.get(students.size()-1).getId() + 1);
        students.add(s);
    }
}
