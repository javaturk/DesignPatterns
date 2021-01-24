package org.javaturk.dp.ch06.command.account.pattern;

public class AccountFactory implements Factory{
	private static AccountFactory factory = new AccountFactory();

	@Override
	public Account createAccount(int amount){
		return new Account(amount);
	}
	
	public static AccountFactory getInstance() {
		return factory;
	}
}
