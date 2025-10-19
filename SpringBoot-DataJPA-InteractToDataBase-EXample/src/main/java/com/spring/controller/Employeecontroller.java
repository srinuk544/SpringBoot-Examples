package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Employee;
import com.spring.service.EmployeeService;

@RestController
@RequestMapping("api")
public class Employeecontroller {
@Autowired
	public EmployeeService employeeService;
	
@PostMapping("/add")
public Employee addEmployee(Employee emp) {
	return employeeService.saveEmployee(emp);
}

}
