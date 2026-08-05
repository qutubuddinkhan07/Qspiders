package com.qsp.createthread;

public class Account {
	public int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public synchronized void debit(int amount) throws InterruptedException {
		int temp = balance;
		Thread.sleep(2000);
		temp -= amount;
		balance = temp;
	}

	public int getBalance() {
		return balance;
	}
}
