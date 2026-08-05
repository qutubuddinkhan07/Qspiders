package com.qsp.starter;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
//@NoArgsConstructor	// must be removed if you only want to declared variable with final keyword
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor

public class Test1 {
	private int intData;

	private final double decimal;
	private final String str;
}
