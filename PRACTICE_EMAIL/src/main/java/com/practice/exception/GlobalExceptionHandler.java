package com.practice.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.practice.dtos.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@Value("${spring.application.name}")
	private String serviceName;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse<String>> generalExceptionHandler(Exception ex) {
		ApiResponse<String> apiResponse = ApiResponse.<String>builder().serviceName(serviceName)
				.message("some error occured").success(false).data(ex.getMessage()).build();
		return ResponseEntity.<ApiResponse<String>>ok(apiResponse);
	}
}
