package com.service.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.book.entity.Book;
import com.service.book.service.IBookService;

@RestController
@RequestMapping("api/v1/digitalbooks")
public class BookController {

	@Autowired
	public IBookService bookService;
	
	
	//Below APIs will be accessed only by the Author

	@PostMapping("/author/{authorid}/books")
	public Book addBook(@RequestBody Book b, @PathVariable("authorid") Integer authorId) {
		return bookService.addBook(b, authorId);
	}

	@PutMapping("/author/{authorid}/books/{bookid}")
	public Book editBook(@RequestBody Book b, @PathVariable("bookid") Integer id,
			@PathVariable("authorid") Integer authorId) {
		return bookService.editBook(b, id, authorId);
	}

	@PostMapping("/author/{authorid}/books/{bookid}")
	public Boolean setBookState(@PathVariable("authorid") Integer authorId, @PathVariable("bookid") Integer bookId,
			@RequestParam String block) {
		return bookService.setBookState(authorId, bookId, block);
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	//Below APIS will be accessed only by the Reader
	
	//Below APIs are common APIs , can be accessed be Guest/Reader/Author

}
