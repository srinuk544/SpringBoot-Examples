package com.spring.controller;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	private List<Student> st = new ArrayList<>();

	@GetMapping("/student")
	public List<Student> getstudent() {
		return st;

	}

	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {

		st.add(student);
		return "student data will add succesfully";

	}

	@PutMapping("/student/{index}")
	public String updatestudent(@PathVariable int index, @RequestBody Student upStudent) {

		if (index >= 0 && index < st.size()) {
			st.set(index, upStudent);
			System.out.println("Student updated successfully!");

		} else {
			System.out.println("Student not update!");
		}

		return null;

	}
}
