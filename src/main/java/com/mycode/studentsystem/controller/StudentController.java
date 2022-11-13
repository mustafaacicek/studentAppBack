package com.mycode.studentsystem.controller;

import com.mycode.studentsystem.business.abstracts.StudentsService;
import com.mycode.studentsystem.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController
{
    @Autowired
    public StudentsService studentsService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentsService.studentSave(student);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudentsController(){
        return studentsService.getAllStudentsServices();
    }
}

