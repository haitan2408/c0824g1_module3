package com.codegym.ss9.service.impl;

import com.codegym.ss9.model.Classroom;
import com.codegym.ss9.repository.ClassroomRepository;
import com.codegym.ss9.service.IClassroomService;

import java.util.List;

public class ClassroomService implements IClassroomService {
    private static final ClassroomRepository classroomRepository = new ClassroomRepository();
    @Override
    public List<Classroom> getAll() {
        return classroomRepository.findAll();
    }

    @Override
    public void save(Classroom s) {

    }

    @Override
    public void update(int id, Classroom s) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Classroom findById(int id) {
        return null;
    }

    @Override
    public List<Classroom> findByName(String name) {
        return null;
    }
}
