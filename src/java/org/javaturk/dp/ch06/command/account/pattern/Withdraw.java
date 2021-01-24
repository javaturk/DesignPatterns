package org.javaturk.dp.ch06.command.account.pattern;

public class Withdraw extends AbstractTransaction {

	@Override
	public void execute(int amount) {
		this.amount = amount;
		try {
			account.withdraw(amount);
		} catch (NotEnoughBalanceException e) {
			System.out.println("Can't withdraw: " + e.getMessage());
		}
		
		account.addTransaction(this);
	}

	@Override
	public void undo() {
		account.deposit(amount);
		account.addTransaction(this);
	}
}
