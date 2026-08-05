package com.practice.serviceimpl;

import java.util.List;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.practice.service.AuthService;
import com.practice.util.JWTUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
	private final AuthenticationManager authManager;

	private final JWTUtil jwtUtil;

	@Override
	public String authUsernamePassword(String username, String password) {
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
		try {
			Authentication authentication = authManager.authenticate(token);
			List<String> roles = authentication.getAuthorities().stream().map(authority -> authority.getAuthority())
					.toList();
			log.info("User '{}' authenticated with roles: {}", authentication.getName(), roles);
			String jwt_token = jwtUtil.createJwtToken(username, roles);
			return jwt_token;
//			return "Login success";
		} catch (Exception e) {
			throw new RuntimeException("Invalid username or password");
		}
	}

}
