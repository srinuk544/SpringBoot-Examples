package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookapp.model.Book;

@Component
public class BookUtill {

	public List<Book> getAllBooks() {
		return Arrays.asList(new Book("java in action ", 1, "kathy", "Tech", 900),
				new Book("spring in action ", 2, "John", "Tech", 1200),
				new Book("5Am  club ", 1, "Robin", "Tech", 450),
				new Book("headfirst JSP ", 1, "kathy", "Tech", 1090),
				new Book("java for dummies ", 1, "kevin", "Tech", 900),
				new Book("secret", 1, "Rhonda", "selfhelp", 780), 
				new Book("Leadership ", 1, "Robin", "selfhelp", 550));

	}

}
