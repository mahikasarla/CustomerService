package com.v4s.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="Wrong UsarNmae/Password")
public class LoginErrorException extends RuntimeException{

}
