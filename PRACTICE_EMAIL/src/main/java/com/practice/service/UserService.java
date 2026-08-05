package com.practice.service;

import com.practice.dtos.AddUserDto;
import com.practice.dtos.EmailOtpVerifyDto;

public interface UserService {
	public String initiateUserVerificationService(AddUserDto dto);

	public String finalUserVerificationService(EmailOtpVerifyDto dto);
}
