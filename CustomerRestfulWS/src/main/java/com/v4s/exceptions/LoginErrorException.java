package com.v4s.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="")
public class LoginErrorException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	
	public LoginErrorException(String errorMessage) {
		super(errorMessage);
	}
	

}
