package org.javaturk.dp.ch06.state.account;

public class Active implements AccountStatus {
	private Account account;

	public Active(Account account) {
		this.account = account;
		System.out.println("Status: Active and balance: " + account.getBalance());
	}

	@Override
	public void withdraw(int amount) {
		int balance = account.getBalance();
		int overdraftLimit = account.getOverdraftLimit();
		if ((balance + overdraftLimit) >= amount) {
			balance -= amount;
			account.setBalance(balance);
			if (balance >= 0) {
				System.out.println("Status: Active and balance: " + account.getBalance());
			}
			if (balance == -overdraftLimit) {
				account.setStatus(new Frozen(account));
			}
			else if (balance < 0) {
				account.setStatus(new Overdrawn(account));
			}
		}
	}

	@Override
	public void deposit(int amount) {
		int balance = account.getBalance();
		balance += amount;
		account.setBalance(balance);
		System.out.println("Status: Active and balance: " + account.getBalance());
	}

	@Override
	public void transfer(int amount) {
		withdraw(amount);
	}

	@Override
	public void close() {
		withdraw(account.getBalance());
		account.setStatus(new Closed(account));
		System.out.println("Account is closed!");
	}
}
