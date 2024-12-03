package com.codegym.ss9.repository;

import com.codegym.ss9.model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

//    private static List<Student> students = new ArrayList<>();
//
//    static {
//        students.add(new Student(1, "Trương Tấn Hải", "hai.truong@codegym.vn", 8.0f, LocalDate.now()));
//        students.add(new Student(2, "Trương Tấn Hải", "hai.truong@codegym.vn", 8.0f, LocalDate.now()));
//        students.add(new Student(3, "Trương Tấn Hải", "hai.truong@codegym.vn", 8.0f, LocalDate.now()));
//    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("select * from students");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name_student");
                String email = resultSet.getString("email");
                Float point = resultSet.getFloat("score");
                LocalDate dob = resultSet.getDate("dob").toLocalDate();
                students.add(new Student(id, name, email, point, dob));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi đọc dữ liệu");
        }
        return students;
    }

    public void save(Student s) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("insert into students(name_student, email, score, dob) values(?, ?, ?, ?)");
            statement.setString(1, s.getName());
            statement.setString(2, s.getEmail());
            statement.setFloat(3, s.getPoint());
            statement.setDate(4, java.sql.Date.valueOf(s.getDob()));
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(int id) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("delete from students where id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Lỗi");
        }
    }
}
