package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dtos.AddUserDto;
import com.practice.dtos.ApiResponse;
import com.practice.dtos.EmailOtpVerifyDto;
import com.practice.service.UserService;

@RestController
@RequestMapping("/api/v2/user")
public class UserController {
	@Autowired
	private UserService userService;

	@Value("${spring.application.name}")
	private String serviceName;

	@PostMapping("/register")
	public ResponseEntity<ApiResponse<String>> inititateUserVerificationController(@RequestBody AddUserDto dto) {
		String serviceResponse = userService.initiateUserVerificationService(dto);
		ApiResponse<String> apiResponse = ApiResponse.<String>builder().serviceName(serviceName)
				.message("successfully sent").success(true).data(serviceResponse).build();

		return ResponseEntity.ok(apiResponse);
	}

	@PostMapping("/verification")
	public ResponseEntity<ApiResponse<String>> finalUserVerificationController(EmailOtpVerifyDto dto) {
		String serviceResponse = userService.finalUserVerificationService(dto);
		ApiResponse<String> apiResponse = ApiResponse.<String>builder().serviceName(serviceName).success(true)
				.message("Verified successfully").data(serviceResponse).build();
		return ResponseEntity.<ApiResponse<String>>ok(apiResponse);
	}
}
