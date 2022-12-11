package com.service.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.book.entity.Book;
import com.service.book.service.IBookService;

@RestController
@RequestMapping("api/v1/digitalbooks/")
public class BookController {
	
	@Autowired
	public IBookService bookService;
	
	@PostMapping("/author/{authorid}/books")
	public Book addBook(@RequestBody Book b , @PathVariable("authorid") Integer authorId) {
		return bookService.addBook(b,authorId);
	}

}
