package org.javaturk.dp.ch06.state.account;

public class Overdrawn implements AccountStatus {

	private Account account;
	
	public Overdrawn(Account account){
		this.account = account;
		System.out.println("Status: Overdrawn and balance: " + account.getBalance());
	}

	@Override
	public void withdraw(int amount) {
		int balance = account.getBalance();
		int overdraftLimit = account.getOverdraftLimit();
		if ((balance + overdraftLimit) >= amount) {
			balance -= amount;
			account.setBalance(balance);
			System.out.println("Status: Overdrawn and balance: " + account.getBalance());
			if (balance == -overdraftLimit) {
				account.setStatus(new Frozen(account));
			}
		}	
		else{
			System.out.println("Status: Overdrawn and balance: " + account.getBalance());
			System.out.println("You can not withdraw money!");
		}
	}

	@Override
	public void deposit(int amount) {
		int balance = account.getBalance();
		amount -= account.getOverdraftLimit();
		balance =+ amount;
		account.setBalance(balance);
		if(account.getBalance() >= 0){
			account.setStatus(new Active(account));
		}
	}

	@Override
	public void transfer(int amount) {
		System.out.println("In overdrawn state no transfer is allowed!");
	}

	@Override
	public void close() {
		System.out.println("In overdrawn state the  account can't be closed!");		
	}
}
