package com.spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {

	private String name;
	private String address;
	private int marks;

	public String getName() {
		return name;
	}

	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	@Value("${student.address}")
	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	@Value("${student.marks}")
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

}
