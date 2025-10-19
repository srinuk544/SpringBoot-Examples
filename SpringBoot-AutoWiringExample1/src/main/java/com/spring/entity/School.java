package com.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class School {
	private String sname;
@Autowired
	private Student student;

	
	//setter injection
	/*
	 * @Autowired public void setStudent(Student student) { this.student = student;
	 * }
	 */

	
	//consructor injection
	/*
	 * @Autowired public School(Student student) { this.student = student;
	 * 
	 * }
	 */

	public String getSname() {
		return sname;
	}

	@Value("${school.sname}")
	public void setSname(String sname) {
		this.sname = sname;
	}

	public void show() {
		System.out.println("School Name: " + sname);
		System.out.println(
				"Student Data: " + student.getName() + " --- " + student.getAddress() + " --- " + student.getMarks());
	}

}
