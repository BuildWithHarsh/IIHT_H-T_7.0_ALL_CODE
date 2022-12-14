package com.service.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundExceptionHandler extends RuntimeException {

	private static final long serialVersionUID = -3520094897410799577L;
	private String entity;
	private String fieldName;
	private String fieldValue;

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public UserNotFoundExceptionHandler(String entity, String fieldName, String fieldValue) {
		super(String.format("%s with %s : %s was not found", entity, fieldName, fieldValue));
		this.entity = entity;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}
