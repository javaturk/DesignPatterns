package org.javaturk.dp.ch02.coupling.account.account1;

import org.javaturk.dp.ch02.coupling.account.ex.InsufficentBalanceException;
import org.javaturk.dp.ch02.coupling.account.ex.NegativeAmountException;

public class Account {

	private double balance;

	public void changeBalance(String action, double amount)
			throws InsufficentBalanceException, NegativeAmountException {
		if (amount < 0)
			throw new NegativeAmountException(amount);

		if (action.equals("Deposit"))
			balance += amount;
		else if (action.equals("Withdraw")) {
			if (balance >= amount)
				balance -= amount;
			else
				throw new InsufficentBalanceException(action, balance, amount);
		}
//		   log.info(action + " : " + amount + " for account id: " + id);
	}
}
