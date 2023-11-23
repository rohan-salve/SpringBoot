package com.ron.globalhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ron.exception.StockNotFoundException;

@RestControllerAdvice
public class StockRestApiError {

	@ExceptionHandler(value = StockNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(StockNotFoundException se)
	{
		return new ResponseEntity<String>(se.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> handleAnyException(Exception se)
	{
		return new ResponseEntity<String>(se.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
