package org.javaturk.dp.ch06.command.account.problem;

public class Account {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) throws NotEnoughBalanceException {
		if (amount <= balance)
			balance -= amount;
		else
			throw new NotEnoughBalanceException(balance, amount);
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
}
