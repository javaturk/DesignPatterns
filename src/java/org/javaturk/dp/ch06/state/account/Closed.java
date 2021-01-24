package org.javaturk.dp.ch06.state.account;

public class Closed implements AccountStatus {
	private Account account;

	public Closed(Account account) {
		this.account = account;
		System.out.println("Status: Closed and balance: " + account.getBalance());
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Account closed!");
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Account closed!");
	}

	@Override
	public void transfer(int amount) {
		System.out.println("Account closed!");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
