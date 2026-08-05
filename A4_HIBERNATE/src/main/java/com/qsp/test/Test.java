package com.qsp.test;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factry = Persistence.createEntityManagerFactory("a4");
		factry.close();
		System.out.println("Connection tested!!");
	}
}
