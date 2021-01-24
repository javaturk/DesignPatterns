package org.javaturk.dp.ch02.anemic.account1;

public class Account {
	
	private String iban;
	private double balance;

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
