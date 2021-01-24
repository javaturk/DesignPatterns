package org.javaturk.dp.ch02.coupling.account.account2;

public class Deposit implements AccountAction {

	@Override
	public double act(double balance, double amount) {
		balance -= amount;
		return balance;
	}
}
