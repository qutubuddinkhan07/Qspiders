package com.qsp.createthread;

public class TestDrive extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test drive completed");
	}
}
