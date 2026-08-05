package com.practice.serviceimpl;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practice.entity.User;
import com.practice.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailDaoService implements UserDetailsService {
	private final UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optUser = userRepo.findByEmail(username);
		if (optUser.isEmpty()) {
			throw new UsernameNotFoundException("User not found");
		}
		User user = optUser.get();
		return org.springframework.security.core.userdetails.User.withUsername(username).password(user.getPassword())
				.roles(user.getRole()).build();
	}

}
