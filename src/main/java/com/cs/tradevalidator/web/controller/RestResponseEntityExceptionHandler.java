package com.cs.tradevalidator.web.controller;

import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler 
  extends ResponseEntityExceptionHandler {
	
	  @Override
	  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	                                                                HttpHeaders headers, HttpStatus status,
	                                                                WebRequest request) {
		  String errorMessage = "Invalid request params: " + ex.getBindingResult()
			        .getAllErrors().stream()
			        .map(ObjectError::getDefaultMessage)
			        .collect(Collectors.toList()).toString();
		  
	    return response(ex, request, HttpStatus.BAD_REQUEST, errorMessage.toString());
	  }

	  private ResponseEntity<Object> response(Exception ex, WebRequest request, HttpStatus status,
	                                          String message) {
	    return handleExceptionInternal(ex, message, new HttpHeaders(), status, request);
	  }
}