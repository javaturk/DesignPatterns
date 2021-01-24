package org.javaturk.dp.ch06.command.account.pattern;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int balance;
	protected List<Transaction> transactions;

	public Account(int balance) {
		this.balance = balance;
		transactions = new ArrayList<>();
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
	
	public void addTransaction(Transaction tx){
		transactions.add(tx);
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}
}
