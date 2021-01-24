
package org.javaturk.dp.ch06.command.account.pattern;

import java.util.List;

public abstract class AbstractTransaction implements Transaction{
	
	protected Account account;
	protected int amount;
	
	public AbstractTransaction(){
		
	}
	
	@Override
	public void redo() {
		execute(amount);
	}
	
	@Override
	public List<Transaction> getTransactions() {
		return account.getTransactions();
	}
	
	@Override
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @author akin
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " [account=" + account + ", amount=" + amount + "]";
	}
}
