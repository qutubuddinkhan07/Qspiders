package com.qsp.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.qsp.dtos.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<ApiResponse> handleNoSuchElementException(NoSuchElementException ex) {
		ApiResponse response = new ApiResponse(false, "string", ex.getMessage());
		return new ResponseEntity<ApiResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(NullPointerException.class)
	public ApiResponse handleNullPointerException(NullPointerException ex) {
		ApiResponse response = new ApiResponse(false, "string", ex.getMessage());
		return response;
	}
}
