package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

@RestController
@RequestMapping("/Book")
public class BookController {

	@Autowired
	private IBookService iBookService;

	@GetMapping
	public ResponseEntity<List<Book>> getAll() {
		return ResponseEntity.ok(iBookService.getAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<Book> getById(@PathVariable int id) {
		return ResponseEntity.ok(iBookService.getById(id));
	}

	@GetMapping("/author/{author}")
	public ResponseEntity<List<Book>> getByAuthor(@PathVariable String author) {
		return ResponseEntity.ok(iBookService.getByAuthor(author));

	}

	@GetMapping("/author/{author}/price/{price}")
	public ResponseEntity<List<Book>> getByLessPrice(@PathVariable String author, @PathVariable double price) {
		return ResponseEntity.ok(iBookService.getByLesserPrice(author, price));

	}

	@GetMapping("/category/{category}")
	public ResponseEntity<List<Book>> getByCategory(@PathVariable String category) {
		return ResponseEntity.ok(iBookService.getByCategory(category));
	}

	@GetMapping("/title-start/{prefix}")
	public ResponseEntity<List<Book>> getByTitleStarting(@PathVariable String prefix) {
		return ResponseEntity.ok(iBookService.getByTitleStarting(prefix));
	}
}
