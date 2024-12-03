package com.codegym.ss9.controller;

import com.codegym.ss9.model.Student;
import com.codegym.ss9.service.IStudentService;
import com.codegym.ss9.service.impl.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.List;

@WebServlet(name = "studentController", urlPatterns = "/students")
public class StudentController extends HttpServlet {
    private static IStudentService iStudentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                req.getRequestDispatcher("WEB-INF/view/student/add.jsp").forward(req, resp);
                break;
            case "remove":
                int id = Integer.parseInt(req.getParameter("id"));
                iStudentService.remove(id);
                resp.sendRedirect("/students");
                break;
            default:
                List<Student> students = iStudentService.getAll();
                req.setAttribute("students", students);
                req.getRequestDispatcher("WEB-INF/view/student/list.jsp").forward(req, resp);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
       String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                String name = req.getParameter("name");
                String email = req.getParameter("email");
                String dob = req.getParameter("dob");
                Float point = Float.valueOf(req.getParameter("point"));
                DateTimeFormatter f = new DateTimeFormatterBuilder().parseCaseInsensitive()
                        .append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter();
                LocalDate datetime = null;
                try {
                    datetime = LocalDate.parse(dob, f);
                    System.out.println(datetime);
                } catch (DateTimeParseException e) {
                    System.out.println("Lỗi");
                }
                Student student = new Student(name, email, point, datetime);
                iStudentService.save(student);
                resp.sendRedirect("/students");
                break;
        }
    }
}
