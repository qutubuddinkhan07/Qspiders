package com.practice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dtos.ApiResponse;
import com.practice.dtos.LoginRequestDto;
import com.practice.service.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v3/auth")
@RequiredArgsConstructor
public class AuthController {
	private final AuthService authService;

	@PostMapping("/login")
	public ResponseEntity<ApiResponse<String>> authenticateUsernamePasswordController(
			@Valid @RequestBody LoginRequestDto dto) {
		String message = authService.authUsernamePassword(dto.getUsername(), dto.getPassword());
		ApiResponse<String> apiResponse = ApiResponse.<String>builder().serviceName("AUTH_SERVICE").success(true)
				.message("Login successful").data(message).build();
		return ResponseEntity.ok(apiResponse);
	}
}
