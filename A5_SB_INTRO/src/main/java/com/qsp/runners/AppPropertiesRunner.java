package com.qsp.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.qsp.bean.AppData;

@Component
public class AppPropertiesRunner implements CommandLineRunner {

	@Autowired
	private AppData appdata;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(appdata);
	}

}
