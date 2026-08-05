package com.qsp.dbbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = { "staging", "prod" })
public class OracleService implements DbService {
	{
		System.out.println("Oracle service created for staging, prod");
	}
}
