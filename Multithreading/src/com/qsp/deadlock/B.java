package com.qsp.deadlock;

public class B {
	public synchronized void m2(A a1) {
		System.out.println("A class m1 executes " + Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a1.m3();
	}

	public synchronized void m4() {
		System.out.println("A class m3 executes " + Thread.currentThread());
	}
}
