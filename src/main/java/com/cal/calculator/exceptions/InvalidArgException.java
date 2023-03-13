package com.cal.calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class InvalidArgException extends Exception {

	
	public InvalidArgException(String message) {
		super("Invalid Arguement passed ");
		// TODO Auto-generated constructor stub
	}
	
	

}
