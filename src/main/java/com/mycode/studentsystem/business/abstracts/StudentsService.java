package com.mycode.studentsystem.business.abstracts;

import com.mycode.studentsystem.entities.Student;

import java.util.List;

public interface StudentsService {
    public Student studentSave(Student student);
    public List<Student> getAllStudentsServices();
}
