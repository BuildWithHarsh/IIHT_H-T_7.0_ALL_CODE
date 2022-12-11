package com.mgmt.lib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.lib.entity.Book;
import com.mgmt.lib.exception.BookNotFoundExceptionhandler;
import com.mgmt.lib.repository.BookRepository;

@Service
public class BookService implements IBookService {

	@Autowired
	public BookRepository bookRepository;

	@Override
	public Book addBook(Book b) {
		return bookRepository.save(b);
	}

	@Override
	public Book getBookById(Integer id) {
		return bookRepository.findById(id)
				.orElseThrow(() -> new BookNotFoundExceptionhandler("Book", "id", Integer.toString(id)));
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(Book b, Integer id) {
		Book existingBook = bookRepository.findById(id)
				.orElseThrow(() -> new BookNotFoundExceptionhandler("Book", "id", Integer.toString(id)));
		existingBook.setBookAuthor(b.getBookAuthor());
		existingBook.setBookGenre(b.getBookGenre());
		existingBook.setBookName(b.getBookName());
		existingBook.setBookPrice(b.getBookPrice());
		existingBook.setBorrowedStatus(b.getBorrowedStatus());
		return bookRepository.save(existingBook);
	}

	@Override
	public void deleteBook(Integer id) {
		Book existingBook = bookRepository.findById(id)
				.orElseThrow(() -> new BookNotFoundExceptionhandler("Book", "id", Integer.toString(id)));
		bookRepository.deleteById(id);

	}

	@Override
	public void changeStatus(Integer id) {
		Book existingBook = bookRepository.findById(id)
				.orElseThrow(() -> new BookNotFoundExceptionhandler("Book", "id", Integer.toString(id)));
		Boolean status = existingBook.getBorrowedStatus();
		System.out.println(status);
		if (status) {
			status = false;
		} else {
			status = true;
		}
		System.out.println(status);
		existingBook.setBorrowedStatus(status);
		bookRepository.save(existingBook);

	}

}
