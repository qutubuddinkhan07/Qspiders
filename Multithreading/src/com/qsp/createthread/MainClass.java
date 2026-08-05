package com.qsp.createthread;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		Account ac = new Account(10000);
		DebitThread t1 = new DebitThread(ac);
		EmiThread t2 = new EmiThread(ac);

		t1.start();
		t2.start();
		Thread.sleep(5000);
		System.out.println(ac.getBalance());
	}
}
