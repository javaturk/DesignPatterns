package org.javaturk.dp.ch06.state.account;

public class Frozen implements AccountStatus {
	private Account account;
	
	public Frozen(Account account) {
		this.account = account;
		System.out.println("Status: Frozen and balance: " + account.getBalance());
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("In frozen state no withdraw is allowed!");
	}

	@Override
	public void deposit(int amount) {
		int balance = account.getBalance();
		balance =+ amount;
		account.setBalance(balance);
		if(account.getBalance() >= 0)
			account.setStatus(new Active(account));
	}

	@Override
	public void transfer(int amount) {
		System.out.println("In frozen state no transfer is allowed!");
	}

	@Override
	public void close() {
		System.out.println("In frozen state the  account can't be closed!");		
	}

}
