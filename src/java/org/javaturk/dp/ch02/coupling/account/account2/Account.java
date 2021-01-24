package org.javaturk.dp.ch02.coupling.account.account2;

import org.javaturk.dp.ch02.coupling.account.ex.InsufficentBalanceException;
import org.javaturk.dp.ch02.coupling.account.ex.NegativeAmountException;

public class Account {

	private double balance;

	public void changeBalance(AccountAction action, double amount)
			throws InsufficentBalanceException, NegativeAmountException {
		if (amount < 0)
			throw new NegativeAmountException(amount);

		balance = action.act(balance, amount);
//		   log.info(action + " : " + amount + " for account id: " + id);
	}
}
