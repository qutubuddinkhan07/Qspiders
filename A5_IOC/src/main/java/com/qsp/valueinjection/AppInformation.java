package com.qsp.valueinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.ToString;

@Component
@ToString
@Lazy(true)
public class AppInformation {
	@Value("${app.name}")
	String appName;

	@Value("${app.version}")
	double appVersion;

	@Value("${app.developer}")
	String appteam;

	@PostConstruct // init()
	public void doCheck() {
		if (appName == null) {
			throw new RuntimeException("app name is null");
		}
		if (appVersion == 0.0) {
			throw new RuntimeException("app version is null");
		}
		if (appteam == null) {
			throw new RuntimeException("app team is null");
		}

		System.out.println("AppInformation created successfully");
	}

	@PreDestroy // destroy
	public void release() {
		appName = null;
		appVersion = 0.0;
		appteam = null;
		System.out.println("AppInformation resource deallocated");
	}
}
