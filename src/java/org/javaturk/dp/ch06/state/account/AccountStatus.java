package org.javaturk.dp.ch06.state.account;

public interface AccountStatus {
	
	public void withdraw(int amount);
	public void deposit(int amount);
	public void transfer(int amount);
	public void close();
	
}
