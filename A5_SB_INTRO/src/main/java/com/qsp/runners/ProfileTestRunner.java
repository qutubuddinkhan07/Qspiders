package com.qsp.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.qsp.bean.AppConfig;

@Component
public class ProfileTestRunner implements CommandLineRunner {
	@Autowired
	private AppConfig appConfig;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(appConfig);
	}
}
