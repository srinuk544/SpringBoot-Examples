package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

	@GetMapping("/welcome")
	public String Getwelocme() {
		return "Welcome to spring security:";

	}
}
