package com.qsp.dbbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("uat")
public class PgService implements DbService {
	{
		System.out.println("PostGrace service created for uat");
	}
}
