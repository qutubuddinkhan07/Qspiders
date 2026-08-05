package com.practice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {
//This is a wrapper class
	private boolean success;
	private String message;
	private Employee employee;
}
