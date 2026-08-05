package com.qsp.threadcommunication;

public class DebitThread extends Thread {
	Account account;

	public DebitThread(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		try {
			account.debit(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
