package com.qsp.threadcommunication;

public class Account {
	public int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public synchronized void debit(int amount) throws InterruptedException {
		if (amount > balance) {
			System.out.println("Insufficient balance, asked " + amount + " available " + balance);
			wait();
		}
		Thread.sleep(2000);
		System.out.println("Before debit balance " + balance);
		balance -= amount;
		Thread.sleep(2000);
		System.out.println("AFter debit balance " + balance);
	}

	public synchronized void credit(int amount) throws InterruptedException {
		System.out.println("Before credit balance " + balance);
		balance += amount;
		Thread.sleep(2000);
		notify();
		System.out.println("After credit balance " + balance);
	}
}
