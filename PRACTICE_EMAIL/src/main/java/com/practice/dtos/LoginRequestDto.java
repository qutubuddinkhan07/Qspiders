package com.practice.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequestDto {
	@NotBlank(message = "username should not be blank or empty")
	private String username;

	@NotBlank(message = "password should not be blank or empty")
	private String password;
}
