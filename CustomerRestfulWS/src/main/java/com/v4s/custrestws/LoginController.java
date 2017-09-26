package com.v4s.custrestws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.v4s.domain.Login;
import com.v4s.exceptions.ErrorResponse;
import com.v4s.exceptions.LoginErrorException;
import com.v4s.hibernate.LoginDao;

@Controller
public class LoginController {

	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/signin", method=RequestMethod.POST)
	@ResponseBody
	public void getLogin(@RequestBody Login login) {
		
		logger.info("Welcome Login !!");
		LoginDao ld = new LoginDao();
		ld.buildSessionFactory();
		Login l=ld.getLogin(login.getLoginId());
		if(l.getUserName().equals(login.getUserName())) {
			if(l.getPassword().equals(login.getPassword())) {
				
			}
			else {
				throw new LoginErrorException("invalid Password/username");
			}
		}
		else {
			throw new LoginErrorException("invalid Password/username");
		}

	}
	
	@ExceptionHandler(LoginErrorException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		error.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value="/signup" ,method=RequestMethod.POST)
	@ResponseBody
	public String createLogin(@RequestBody Login login) {
		
		logger.info("Welcome Login !!");
		LoginDao ld = new LoginDao();
		ld.buildSessionFactory();	
		if(ld.createLogin(login)) {
		return"successfully registerd";
		}
		else
			return "failed";
	}
	
	
}
