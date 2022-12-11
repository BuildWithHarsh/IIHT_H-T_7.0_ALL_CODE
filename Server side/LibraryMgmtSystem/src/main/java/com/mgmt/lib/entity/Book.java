package com.mgmt.lib.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	private String bookName;
	private String bookAuthor;
	private Float bookPrice;
	private String bookGenre;
	private Boolean borrowedStatus;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String bookAuthor, float bookPrice, String bookGenre, Boolean borrowedStatus) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookGenre = bookGenre;
		this.borrowedStatus = borrowedStatus;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public Boolean getBorrowedStatus() {
		return borrowedStatus;
	}

	public void setBorrowedStatus(Boolean borrowedStatus) {
		this.borrowedStatus = borrowedStatus;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookGenre=" + bookGenre + ", borrowedStatus=" + borrowedStatus + "]";
	}

}
