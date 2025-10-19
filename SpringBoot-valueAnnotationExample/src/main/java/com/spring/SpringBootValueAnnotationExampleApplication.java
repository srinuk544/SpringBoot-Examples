package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.bean.Employee;

@SpringBootApplication
public class SpringBootValueAnnotationExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringBootValueAnnotationExampleApplication.class, args);

		Employee e = ap.getBean(Employee.class);
		System.out.println(e.getEname());
		System.out.println(e.getAddress());
		System.out.println(e.getSalary());
		System.out.println(e.getId());
	}

}
