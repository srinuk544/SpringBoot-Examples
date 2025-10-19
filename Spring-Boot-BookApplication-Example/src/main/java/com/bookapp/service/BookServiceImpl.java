package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookUtill;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private BookUtill bookUtill;

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub

		List<Book> result = getAll().stream()
				.filter(b -> b.getAuthor() != null && b.getAuthor().equalsIgnoreCase(author))
				.collect(Collectors.toList());
		if (result.isEmpty()) {
			throw new BookNotFoundException("No books found for author: " + author);

		}
		return result;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> result = getAll().stream()
				.filter(b -> b.getCategory() != null && b.getCategory().equalsIgnoreCase(category))
				.collect(Collectors.toList());

		if (result.isEmpty()) {
			throw new BookNotFoundException("No books found for CategoryList:" + category);

		}
		return result;
	}

	@Override
	public List<Book> getByLesserPrice(String author, double price) {
		// TODO Auto-generated method stub

		List<Book> res = getAll().stream()
				.filter(b -> b.getAuthor() != null && b.getAuthor().equalsIgnoreCase(author) && b.getPrice() < price)
				.collect(Collectors.toList());
		if (res.isEmpty()) {
			throw new BookNotFoundException("No books found for author '" + author + "' with price < " + price);
		}
		return res;
	}

	@Override
	public List<Book> getByTitleStarting(String choice) {
		// TODO Auto-generated method stub
		List<Book> res = getAll().stream()
				.filter(i -> i.getTitle() != null && i.getTitle().trim().toLowerCase().startsWith(choice.toLowerCase()))
				.collect(Collectors.toList());
		if (res.isEmpty()) {
			throw new BookNotFoundException("No books found starting with: " + choice);

		}
		return res;
	}

	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub

		return getAll().stream().filter(i -> i.getBookId() != null && i.getBookId() == bookId).findFirst()
				.orElseThrow(() -> new BookNotFoundException("Book not found with id: " + bookId));

	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookUtill.getAllBooks();

	}

}
