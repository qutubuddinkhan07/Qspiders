package com.practice.serviceimpl;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.practice.dtos.AddUserDto;
import com.practice.dtos.EmailOtpVerifyDto;
import com.practice.entity.User;
import com.practice.event.SimpleMessageEvent;
import com.practice.modelmapper.ModelMapper;
import com.practice.repository.UserRepository;
import com.practice.service.UserService;
import com.practice.util.EmailMessageBuilderUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final EmailMessageBuilderUtil emailMessageBuilderUtil;

	private final Random random;

	private final ApplicationEventPublisher eventPublisher;

	private final ModelMapper modelMapper;

	private final UserRepository userRepository;

	private final @Qualifier("otpHolder") Map<String, Object[]> otpHolder;

	@Override
	public String initiateUserVerificationService(AddUserDto dto) {
		log.info("" + Thread.currentThread());
		String otp = String.valueOf(random.nextInt(100000, 999999));
		String otpMessage = emailMessageBuilderUtil.otpMessageBuilder(dto.getName(), otp);

		SimpleMessageEvent emailEvent = SimpleMessageEvent.builder().receiverEmail(dto.getEmail()).message(otpMessage)
				.subject("Products alert: OTP").build();

		eventPublisher.publishEvent(emailEvent);

		Object[] tempOtpData = { otp, LocalDateTime.now().plusMinutes(5), dto };
		otpHolder.put(dto.getEmail(), tempOtpData);

		log.info("OTP stored for email: {}", dto.getEmail());
		return "OTP sent to email: " + dto.getEmail();
	}

	@Override
	public String finalUserVerificationService(EmailOtpVerifyDto dto) {
		Object[] tempUserData = otpHolder.get(dto.getEmail());
		if (tempUserData == null) {
			throw new RuntimeException("Invalid email id");
		}

		LocalDateTime currDateTime = LocalDateTime.now();
		LocalDateTime expiryDateTime = (LocalDateTime) tempUserData[1];
		if (currDateTime.isAfter(expiryDateTime)) {
			throw new RuntimeException("Time over, use keypad");
		}

		String inMemoryOtp = (String) tempUserData[0];
		String userOtp = dto.getOtp();
		if (!inMemoryOtp.equals(userOtp)) {
			throw new RuntimeException("Invalid OTP");
		}

		// TODO get the user dto and save the user in db
		AddUserDto userDto = (AddUserDto) tempUserData[2];
		User user = modelMapper.addUserDtoToEntity(userDto);
		userRepository.save(user);

		String message = emailMessageBuilderUtil.userRegisteredMessageBuilder(user.getName());
		SimpleMessageEvent event = SimpleMessageEvent.builder().receiverEmail(dto.getEmail())
				.subject("ALERT: Registration complete").message(message).build();

		eventPublisher.publishEvent(event);

		return "User saved";
	}

}
