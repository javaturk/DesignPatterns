package org.javaturk.dp.ch03.lsp.designByContract.taxi;

public class Taxi{
	protected String name;
	protected Customer customer;
	
	public Taxi(String name) {
		this.name = name;
	}

	public boolean take(Customer customer) {
		// Require
		if(checkPrecondition(customer)) {
			this.customer = customer;
			return true;
		}
		else
			return false;	
	}
	
	public boolean checkPrecondition(Customer customer) {
		if(customer.getDistance() < 1000)
			return true;
		else
			return false;
	}
	
	public Service service() {
		return new Service();
	}

	public String getName() {
		return name;
	}
}
