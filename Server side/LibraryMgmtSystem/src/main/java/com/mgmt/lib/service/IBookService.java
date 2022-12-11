package com.mgmt.lib.service;

import java.util.List;

import com.mgmt.lib.entity.Book;

public interface IBookService {

	public Book addBook(Book b);

	public Book getBookById(Integer id);

	public List<Book> getAllBooks();

	public Book updateBook(Book b, Integer id);

	public void deleteBook(Integer id);
	
	public void changeStatus(Integer id);

}
