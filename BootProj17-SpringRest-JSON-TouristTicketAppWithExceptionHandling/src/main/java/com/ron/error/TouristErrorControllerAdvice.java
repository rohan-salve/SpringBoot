package com.ron.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ron.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristErrorControllerAdvice {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristNotFound(TouristNotFoundException e)
	{
		System.out.println("TouristErrorControllerAdvice.handleTouristNotFound()");
		
		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),e.getMessage(),"404 - Not Found");
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllErrors(Exception e)
	{
		System.out.println("TouristErrorControllerAdvice.handleAllErrors()");
		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),e.getMessage(),"Some problem at Server");
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
