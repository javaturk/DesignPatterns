package org.javaturk.dp.ch03.srp.domain;

import java.io.Serializable;
import java.util.List;

import org.javaturk.dp.ch03.srp.customerService.solution.ex.*;
import org.javaturk.dp.ch03.srp.customerService.solution.util.ATMProperties;

public class Account implements Serializable {
	protected String iban;
	protected double balance;
	protected boolean defaultAccount;
	protected Customer owner;
	private List<Transaction> transactions;

	public Account() {
	}

	public Account(String iban, double balance, boolean defaultAccount,
			Customer owner) {
		this.iban = iban;
		this.balance = balance;
		this.defaultAccount = defaultAccount;
		this.owner = owner;
	}

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

	public boolean isDefaultAccount() {
		return defaultAccount;
	}

	public void setDefaultAccount(boolean defaultAccount) {
		this.defaultAccount = defaultAccount;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public synchronized void withdraw(double amount)
			throws InsufficentFundException, NegativeAmountException {
		if (amount >= 0) {
			if (balance >= amount) {
				balance -= amount;
			} else
				throw new InsufficentFundException("Balance: " + balance
						+ " Amount to be withdrawn: " + amount);
		} else
			throw new NegativeAmountException("Amount provided: " + amount);
	}

	public synchronized void deposit(double amount)
			throws NegativeAmountException {
		if (amount >= 0) {
			balance += amount;
		} else
			throw new NegativeAmountException("Amount provided: " + amount);
	}

	public void eft(double amount) throws InsufficentFundException,
			NegativeAmountException {
		String eftFeeString = ATMProperties.getProperty("transaction.eftFee");
		double eftFee = Double.parseDouble(eftFeeString);
		withdraw(amount + eftFee);
	}

	public void transfer(double amount) throws InsufficentFundException,
			NegativeAmountException {
		withdraw(amount);
	}

	@Override
	public int hashCode() {
		return iban.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (iban == null) {
			if (other.iban != null)
				return false;
		} else if (!iban.equals(other.iban))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [iban=" + iban + ", balance=" + balance
				+ ", isDefault=" + defaultAccount + ", owner=" + owner.getTckn()
				+ "]";
	}

}
