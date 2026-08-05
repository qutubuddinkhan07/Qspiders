package com.qsp.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemBeanConfiguration {

	@Bean("random")
	public Random createRandomObject() {
		return new Random();
	}
}
