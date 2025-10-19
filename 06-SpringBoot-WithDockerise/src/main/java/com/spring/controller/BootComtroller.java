package com.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootComtroller {

	@GetMapping("/helo/msg")
	public String Getmessage(String msg) {
		return " hello docker:";

	}

	@GetMapping("/book-show")
	public List<String> showbooks() {
		return Arrays.asList("java", "python", "AWS");
	}
}
