
package org.javaturk.dp.ch06.command.account.problem;

public class NotEnoughBalanceException extends Exception {
	private static String description = "Account does not have enough balance: Balance: ";
	
	public NotEnoughBalanceException(int balance, int amount){
		super(description + balance + " Amount: " + amount);
	}

}
