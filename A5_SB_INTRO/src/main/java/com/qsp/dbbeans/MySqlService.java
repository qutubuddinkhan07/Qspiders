package com.qsp.dbbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = { "dev", "qa" })
public class MySqlService implements DbService {
	{
		System.out.println("MySQL service created for qa, dev");
	}
}
