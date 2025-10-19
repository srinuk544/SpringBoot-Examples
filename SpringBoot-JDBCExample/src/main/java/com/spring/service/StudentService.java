package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.model.Student;
import com.spring.repositry.StudentRepositrey;

import java.util.List;

@Service
public class StudentService {
	private final StudentRepositrey studentRepository;

	public StudentService(StudentRepositrey studentRepository) {
		this.studentRepository = studentRepository;
	}

	/*
	 * public List<Student> getAllStudents() { return studentRepository.findAll(); }
	 * 
	 * public Student getStudentById(int id) { return
	 * studentRepository.findById(id); }
	 */

	public int addStudent(Student student) {
		return studentRepository.save(student);
	}

	/*
	 * public int updateStudent(Student student) { return
	 * studentRepository.update(student); }
	 * 
	 * public int deleteStudent(int id) { return studentRepository.deleteById(id); }
	 */
}
