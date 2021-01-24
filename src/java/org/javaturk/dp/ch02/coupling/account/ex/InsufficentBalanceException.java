package org.javaturk.dp.ch02.coupling.account.ex;

public class InsufficentBalanceException extends Exception {

	public InsufficentBalanceException(String action, double balance, double amount) {
	}

	public InsufficentBalanceException(double balance, double amount) {
	}

}
