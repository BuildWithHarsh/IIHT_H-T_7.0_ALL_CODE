package com.mgmt.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgmt.lib.entity.Book;
import com.mgmt.lib.service.IBookService;

@RestController
public class BookController {

	@Autowired
	public IBookService bookService;

	@PostMapping("/add/book")
	public Book addBook(@RequestBody Book b) {
		return bookService.addBook(b);
	}

	@GetMapping("/read/{id}")
	public Book getBookById(@PathVariable("id") Integer id) {
		return bookService.getBookById(id);
	}

	@GetMapping("/allbooks")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@PutMapping("update/{id}")
	public Book updateBook(@RequestBody Book b, @PathVariable Integer id) {
		return bookService.updateBook(b, id);
	}

	@DeleteMapping("/remove/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}

	@PutMapping("/borrow/{id}")
	public void changeStatus(@PathVariable Integer id) {

		bookService.changeStatus(id);
	}

}
