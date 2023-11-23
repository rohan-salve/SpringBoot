package com.ron.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ron.error.ErrorDetails;
import com.ron.exception.StudentNotFoundException;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorDetails> handlerRecordNotFoundException(StudentNotFoundException se)
	{
		return new ResponseEntity<ErrorDetails>
		(new ErrorDetails(LocalDateTime.now(),se.getMessage(),"RECORD NOT FOUND"),HttpStatus.NOT_FOUND);
	}
	
	
	public ResponseEntity<ErrorDetails> handlerOtherException(Exception se)
	{
		return new ResponseEntity<ErrorDetails>
		(new ErrorDetails(LocalDateTime.now(),se.getMessage(),"INTERNAL SERVER ERROR"),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
