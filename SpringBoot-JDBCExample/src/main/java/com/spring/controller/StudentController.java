package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Student;
import com.spring.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController  {

	private final StudentService studentService;

	
	 public StudentController(StudentService studentService) {
	        this.studentService = studentService;
	    }
	 
	 @PostMapping("students")
	    public String addStudent(@RequestBody Student student) {
	        studentService.addStudent(student);
	        return "Student added successfully!";
	    }
	 
	 
	
	 
}
