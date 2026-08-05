package com.qsp.createthread;

public class PaperWork extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("paper checking completed");
	}
}
