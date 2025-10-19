package com.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	@GetMapping("/student")
	public List<Student> getstudents() {
		return Arrays.asList(new Student("srinu", 24, "java"), new Student("vasu", 25, "python"),
				new Student("hari", 26, "pharmma"));

	}

}
