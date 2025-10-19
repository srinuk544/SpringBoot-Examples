package com.spring.repositry;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Student;

@Repository
public class StudentRepositrey {

	private JdbcTemplate jdbcTemplate;

	public StudentRepositrey(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;

	}

	// 1. Insert a new student
	public int save(Student student) {
		String sql = "INSERT INTO studentdata (name, age) VALUES (?, ?)";
		return jdbcTemplate.update(sql, student.getName(), student.getAge());
	}

}
