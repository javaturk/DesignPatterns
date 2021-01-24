package org.javaturk.dp.ch02.anemic.account2;

import org.javaturk.dp.ch02.coupling.account.ex.NegativeAmountException;

public class AmountValidator {
	
	public void validate(double amount) throws NegativeAmountException {
		if(amount < 0)
		      throw new NegativeAmountException(amount);

	}
}
