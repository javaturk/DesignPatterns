package org.javaturk.dp.ch06.state.account;

public class Test {
	public static void main(String[] args) {

		Account account = new Account(1000, false);
		account.deposit(1000);
		account.transfer(200);
		account.withdraw(2500);
		account.withdraw(200);
//		account.transfer(500);
		account.withdraw(100);
//		account.closeAccount();
//		account.withdraw(100);
		account.transfer(500);
		account.deposit(2000);
		account.closeAccount();
	}
}
