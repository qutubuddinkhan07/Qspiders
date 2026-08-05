package com.qsp.threadcommunication;

public class CreditThread extends Thread {
	Account account;

	public CreditThread(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		try {
			account.credit(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
