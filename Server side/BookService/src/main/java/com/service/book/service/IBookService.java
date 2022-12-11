package com.service.book.service;

import com.service.book.entity.Book;

public interface IBookService {

	public Book addBook(Book b, Integer authorId);

	public Book editBook(Book b, Integer bookId);
	
	public Book getBookBySubId(String userEmail , Integer subscriptionId);

	public Boolean setBookState(String block);
	
	public Boolean cancelSubscription(Integer subscriptionId);

}
