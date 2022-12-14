package com.service.book.service;

import java.util.List;

import com.service.book.entity.Book;

public interface IBookService {

	public Book addBook(Book b, Integer authorId);

	public Book editBook(Book b, Integer bookId , Integer authorId);

	public Boolean setBookState(Integer authorId, Integer bookId, String block);
	
	public List<Book> getAllBooks();

}
