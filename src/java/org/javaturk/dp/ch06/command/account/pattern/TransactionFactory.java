package org.javaturk.dp.ch06.command.account.pattern;

public interface TransactionFactory {
	
	public Transaction createWithdraw();
	
	public Transaction createDeposit();

}
