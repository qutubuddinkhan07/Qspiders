package com.qsp.util;

public enum LogInStatus {
	VALID("valid"), INVALID("invalid");

	private String status;

	private LogInStatus(String status) {
		this.status = status;
	}

	public String getValue() {
		return this.status;
	}
}
