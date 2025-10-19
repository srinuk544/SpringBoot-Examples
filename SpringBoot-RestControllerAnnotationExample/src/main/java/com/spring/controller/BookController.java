package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.Book;

@RestController 
@RequestMapping("/api")
public class BookController {

	@GetMapping("/bk") 
	public Book getBook() {
		return new Book("Java", 1, "Core Java"); // Return the Book object
	}
}