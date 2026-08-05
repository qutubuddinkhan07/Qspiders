package com.qsp.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.qsp.dbbeans.DbService;

@Component
public class DbProfileRinner implements CommandLineRunner {

	@Autowired
	private DbService dbservice;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbservice);
	}

}
