package com.codegym.ss9.service;

import com.codegym.ss9.dto.StudentDTO;
import com.codegym.ss9.model.Student;

import java.util.List;

public interface IStudentService extends IService<Student> {

    List<StudentDTO> getAllDTO();
}
