package com.practice.modelmapper;

import java.time.LocalDateTime;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.practice.dtos.AddUserDto;
import com.practice.entity.User;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ModelMapper {
	private final PasswordEncoder passwordEncoder;

	public User addUserDtoToEntity(AddUserDto dto) {
		User user = User.builder().name(dto.getName()).email(dto.getEmail())
				.password(passwordEncoder.encode(dto.getPassword())).role(dto.getRole()).createdAt(LocalDateTime.now())
				.updatedAt(LocalDateTime.now()).build();
		return user;
	}
}
