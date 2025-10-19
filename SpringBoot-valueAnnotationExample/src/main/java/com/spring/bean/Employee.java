package com.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {

	public String getEname() {
		return ename;
	}

	public String getAddress() {
		return address;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	@Value("${employee.ename}")
	private String ename;
	@Value("${employee.address}")
	private String address;
	@Value("${employee.salary}")
	private double salary;
	@Value("${employee.id}")
	private int id;

}
