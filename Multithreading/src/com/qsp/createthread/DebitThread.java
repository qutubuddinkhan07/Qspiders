package com.qsp.createthread;

public class DebitThread extends Thread {
	Account account;

	public DebitThread(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		try {
			account.debit(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
