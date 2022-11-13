package com.mycode.studentsystem.business.concretes;

import com.mycode.studentsystem.business.abstracts.StudentsService;
import com.mycode.studentsystem.dataAccess.StudentRepository;
import com.mycode.studentsystem.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentManager implements StudentsService {

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Student studentSave(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudentsServices() {
        return studentRepository.findAll();
    }
}
