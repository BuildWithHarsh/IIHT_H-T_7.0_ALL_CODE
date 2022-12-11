package com.service.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.book.entity.Book;
import com.service.book.exception.BookNotFoundExceptionHandler;
import com.service.book.repository.BookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	public BookRepository bookRepository;

	@Override
	public Book addBook(Book b, Integer authorId) {
		b.setAuthorId(authorId);
		return bookRepository.save(b);
	}

	@Override
	public Book editBook(Book b, Integer bookId) {
		Book book = bookRepository.findById(bookId)
				.orElseThrow(() -> new BookNotFoundExceptionHandler("Book", "id", Integer.toString(bookId)));
		book.setTitle(b.getTitle());
		book.setActive(b.isActive());
		book.setAuthor(b.getAuthor());
		book.setCategory(b.getCategory());
		book.setContent(b.getContent());
		book.setLogo(b.getLogo());
		book.setPrice(b.getPrice());
		b.setPublishedDate(b.getPublishedDate());
		book.setPublisher(b.getPublisher());
		return bookRepository.save(book);
	}

	@Override
	public Boolean setBookState(String block) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookBySubId(String userEmail, Integer subscriptionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelSubscription(Integer subscriptionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
