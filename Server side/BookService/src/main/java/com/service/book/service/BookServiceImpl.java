package com.service.book.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
		b.setPublishedDate(java.sql.Date.valueOf(LocalDate.now()));
		return bookRepository.save(b);
	}

	@Override
	public Book editBook(Book b, Integer bookId, Integer authorId) {
		Optional<Book> bookObj = bookRepository.findByAuthorIdAndBookId(authorId, bookId);
		Book book = bookObj.get();
		if (Objects.nonNull(book)) {
			book.setTitle(b.getTitle());
			book.setActive(b.isActive());
			book.setAuthor(b.getAuthor());
			book.setCategory(b.getCategory());
			book.setContent(b.getContent());
			book.setLogo(b.getLogo());
			book.setPrice(b.getPrice());
			b.setPublishedDate(java.sql.Date.valueOf(LocalDate.now()));
			book.setPublisher(b.getPublisher());
			bookRepository.save(book);
			return book;
		} else {
			throw new BookNotFoundExceptionHandler("Book", "id", Integer.toString(bookId));
		}
	}

	@Override
	public Boolean setBookState(Integer authorId, Integer bookId, String block) {
		Optional<Book> bookObj = bookRepository.findByAuthorIdAndBookId(authorId, bookId);
		Book book = bookObj.get();
		Boolean status = book.isActive();
		if (Objects.nonNull(book)) {
			if (block.equalsIgnoreCase("yes")) {
				status = false;
				book.setActive(status);
			} else {
				status = true;
				book.setActive(status);
			}
			bookRepository.save(book);
			return status;
		} else {
			throw new BookNotFoundExceptionHandler("Book", "id", Integer.toString(bookId));
		}
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
