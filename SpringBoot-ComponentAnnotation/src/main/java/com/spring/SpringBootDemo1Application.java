package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.entity.Student;

@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringBootDemo1Application.class, args);

		Student s = ap.getBean(Student.class);
		System.out.println(s.toString());

	}

}
