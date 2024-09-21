package com.example.student_demo.service;

import com.example.student_demo.dto.StudentDTO;
import com.example.student_demo.model.Student;
import com.example.student_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addstudent(StudentDTO studentDTO) {

        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());

        return studentRepository.save(student);

    }

    public List<Student> getstudent(){
       return studentRepository.findAll();
    }

}
