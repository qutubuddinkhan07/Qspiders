package com.qsp.starter;

import lombok.Data;
import lombok.NonNull;

@Data
public class Test2 {
	private int intData;
	@NonNull
	private Double decimal;
	@NonNull
	private String sequence;
}
