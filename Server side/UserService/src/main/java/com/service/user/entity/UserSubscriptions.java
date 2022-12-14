package com.service.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserSubscriptions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer subscriptionId;
	private String userId;
	private Integer bookId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public UserSubscriptions(String userId, Integer bookId) {
		super();
		this.userId = userId;
		this.bookId = bookId;
	}

	public UserSubscriptions() {
		super();
	}

}
