package com.codegym.ss9.repository;

import com.codegym.ss9.model.Classroom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClassroomRepository {
    public List<Classroom> findAll() {
        List<Classroom> classrooms = new ArrayList<>();
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("select * from classrooms");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String nameClass = resultSet.getString("name_class");
                LocalDate startDate = resultSet.getDate("start_date").toLocalDate();
                LocalDate endDate = resultSet.getDate("end_date").toLocalDate();
                classrooms.add(new Classroom(id, nameClass, startDate, endDate));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi");
        }
        return classrooms;
    }
}
