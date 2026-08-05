package com.qsp.valueinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Hello {
	int k;
	int l;

	public Hello(@Value("30") int k, @Value("40") int l) {
		this.k = k;
		this.l = l;
	}
}
