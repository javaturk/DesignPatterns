package org.javaturk.dp.ch06.state.account;

public class Account {

	private int balance;
	private final int overdraftLimit = 1000;
	private boolean frozen;

	private AccountStatus status;

	public Account(int balance, boolean frozen) {
		this.balance = balance;
		this.frozen = frozen;
		if (balance > 0)
			status = new Active(this);
		else
			throw new RuntimeException("Initial balance can't be negative!");
	}

	public void deposit(int amount) {
		status.deposit(amount);
	}

	public void withdraw(int amount) {
		status.withdraw(amount);
	}
	
	public void transfer(int amount) {
		status.transfer(amount);
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isFrozen() {
		return frozen;
	}

	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}

	public int getOverdraftLimit() {
		return overdraftLimit;
	}

	 public void closeAccount(){
	 	status.close();
	 }
}
