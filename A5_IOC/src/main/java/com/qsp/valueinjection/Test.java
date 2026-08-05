package com.qsp.valueinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Test {
	int j;

	@Value("20")
	public void setJ(int j) {
		this.j = j;
	}
}
