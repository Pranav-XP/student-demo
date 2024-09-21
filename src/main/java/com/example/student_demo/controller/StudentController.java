package com.example.student_demo.controller;

import com.example.student_demo.dto.StudentDTO;
import com.example.student_demo.model.Student;
import com.example.student_demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String studentView(Model model){
        List<Student> students = studentService.getstudent();

        model.addAttribute("students", students);
        model.addAttribute("studentDTO",new StudentDTO());
        return "index";
    }


    @PostMapping("/")
    public String addStudent(@Valid @ModelAttribute("studentDTO") StudentDTO studentDTO, BindingResult result, Model model){
        if(result.hasErrors()){
            return "index";
        }
        studentService.addstudent(studentDTO);
        return "redirect:/";
    }
}
