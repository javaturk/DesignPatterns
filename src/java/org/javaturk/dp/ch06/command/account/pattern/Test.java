package org.javaturk.dp.ch06.command.account.pattern;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		CheckingAccountFactory caFactory = CheckingAccountFactory.getInstance();
		Account account = caFactory.createAccount(500);
		System.out.println(account);
		
		TransactionFactory txFactory = CheckingAccountTransactionFactory.getInstance();
		
		System.out.println("*** Withdraw ***");
		
		Transaction withdrawTx = txFactory.createWithdraw();

		withdrawTx.setAccount(account);
		
		withdrawTx.execute(500);
		System.out.println(account);
		
		withdrawTx.undo();
		System.out.println(account);
		
		withdrawTx.redo();
		System.out.println(account);
		
		withdrawTx.undo();
		System.out.println(account);
		
		System.out.println("*** Deposit ***");
		
		Transaction depositTx = txFactory.createDeposit();
		depositTx.setAccount(account);
		
		depositTx.execute(2000);
		System.out.println(account);
		
		depositTx.undo();
		System.out.println(account);
		
		depositTx.execute(5000);
		System.out.println(account);
		
		System.out.println("*** Listing Transactions ***");
		
		List<Transaction> transactions = account.getTransactions();
		for(Transaction tx : transactions)
			System.out.println(tx);
	}
}
