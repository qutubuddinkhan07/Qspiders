package com.qsp.valueinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Demo {
	@Value("10")
	int i;
}
