package org.javaturk.dp.ch06.command.account.pattern;

public class CheckingAccountTransactionFactory implements TransactionFactory {
	private static CheckingAccountTransactionFactory factory = new CheckingAccountTransactionFactory();

	
	public static CheckingAccountTransactionFactory getInstance(){
		return factory;
	}
	
	@Override
	public Transaction createWithdraw() {
		return new Withdraw();
	}
	
	@Override
	public Transaction createDeposit() {
		return new Deposit();
	}

}
