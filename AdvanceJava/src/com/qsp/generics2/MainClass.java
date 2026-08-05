package com.qsp.generics2;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		Student[] student = new Student[] { new Student(123, "Aftab", 93), new Student(321, "Naruto", 98),
				new Student(43, "Hinata", 97), new Student(99, "Habibi", 99) };

		Arrays.sort(student); // internally calling compareTo(obj) method
		for (Student val : student) {
			System.out.println(val);
		}
	}
}
/**
 * Student [id=123, name=Aftab, marks=93] Student [id=43, name=Hinata, marks=97]
 * Student [id=321, name=Naruto, marks=98] Student [id=99, name=Habibi,
 * marks=99]
 */
