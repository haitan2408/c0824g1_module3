package com.codegym.ss9.service.impl;

import com.codegym.ss9.model.Student;
import com.codegym.ss9.repository.StudentRepository;
import com.codegym.ss9.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private static final StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student s) {
    studentRepository.save(s);
    }

    @Override
    public void update(int id, Student s) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }
}
