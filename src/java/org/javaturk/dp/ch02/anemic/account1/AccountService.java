package org.javaturk.dp.ch02.anemic.account1;

import org.javaturk.dp.ch02.coupling.account.ex.InsufficentBalanceException;

public class AccountService {
	private static final double EFT_CHARGE = 3;

	public void withdraw(Account account, double amount) throws InsufficentBalanceException {
		double balance = account.getBalance();
		if (balance >= amount) {
			balance -= amount;
			account.setBalance(balance);
		} else
			throw new InsufficentBalanceException(account.getIban(), balance, amount);
	}

	public void deposit(Account account, double amount) throws InsufficentBalanceException {
		double balance = account.getBalance();
		balance += amount;
		account.setBalance(balance);
	}
	
	public void eft(Account sourceAccount, Account targetAccount, double amount) throws InsufficentBalanceException {
		withdraw(sourceAccount, amount);
		withdraw(sourceAccount, EFT_CHARGE);
		deposit(targetAccount, amount);
	}
}
