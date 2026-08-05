package com.qsp.createthread;

public class EmiThread extends Thread {
	Account account;

	public EmiThread(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		try {
			account.debit(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
