package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.bean.Employee;

@Controller

public class EmployeeController {

	@RequestMapping("/employee")
	@ResponseBody
	public Employee getemployee() {

		Employee e = new Employee(20, "Phani", 57650);
		return e;

	}

	/*
	 * @PostMapping() public Employee postmapping(@RequestBody Employee employee) {
	 * 
	 * System.out.println("Employee object will created :" + employee); return
	 * employee;
	 * 
	 * }
	 */
}
