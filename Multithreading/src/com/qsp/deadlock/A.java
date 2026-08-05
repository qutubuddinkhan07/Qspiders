package com.qsp.deadlock;

public class A {
	public synchronized void m1(B b) {
		System.out.println("A class m1 executes " + Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.m4();
	}

	public synchronized void m3() {
		System.out.println("A class m3 executes " + Thread.currentThread());
	}
}
