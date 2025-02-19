package com.abhilive.springboot_rest_api.controller;

import com.abhilive.springboot_rest_api.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8080/student

    @GetMapping("student")
    public Student getStudent() {
        Student student = new Student(1, "Ramesh", "Fadatare");
        return student;
    }

    // http://localhost:8080/students

    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ramesh", "Fadatare"));
        students.add(new Student(2, "Pankaj", "Pawar"));
        students.add(new Student(3, "Neeraj", "Singh"));
        return students;
    }

    // {id} - URI Template Variable
    // http://localhost:8080/student/1/Ramesh/Fadatre
    @GetMapping("student/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(
            @PathVariable("id") int studentId,
            @PathVariable("first-name") String firstName,
            @PathVariable("last-name") String lastName) {
        return new Student(studentId, firstName, lastName);
    }

    // Springboot REST API with Request Param
    // http://localhost:8080/students?id=1
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id) {
        return new Student(id, "Ramesh", "Fadatare");
    }
}
