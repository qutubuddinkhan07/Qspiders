package com.qsp.threadcommunication;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		Account ac = new Account(5000);
		DebitThread d = new DebitThread(ac);
		CreditThread c = new CreditThread(ac);

		d.start();
		Thread.sleep(100);
		c.start();

		/*-
		Insufficient balance, asked 7000 available 5000
		Before credit balance 5000
		After credit balance 11000
		Before debit balance 11000
		AFter debit balance 4000
		 */
	}
}
