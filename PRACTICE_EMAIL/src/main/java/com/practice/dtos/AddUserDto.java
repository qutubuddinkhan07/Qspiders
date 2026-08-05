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
public class AddUserDto {
	@NotBlank(message = "username can't be empty")
	private String name;

	@NotBlank(message = "please enter a valid email")
	private String email;

	@NotBlank(message = "password can't be empty")
	private String password;

	@NotBlank(message = "role can't be empty")
	private String role;
}
