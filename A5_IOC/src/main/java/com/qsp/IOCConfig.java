package com.qsp;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.qsp")
@PropertySource("classpath:app.properties")
public class IOCConfig {

	@Bean("random")
	@Lazy(true)
	public Random createRandomObject() {
		System.out.println(Random.class.getName() + " object created");
		return new Random();
	}

	@Bean
	@Scope("prototype")
	public LocalDateTime createLocalDateTime() {
		return LocalDateTime.now();
	}
}
