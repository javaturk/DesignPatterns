package org.javaturk.dp.ch06.chainOfResponsibility.callCenter;

public abstract class AbstractCallTaker implements CallTaker{
	protected CallTaker next;
	protected Customer customer;
	
	public AbstractCallTaker(CallTaker next) {
		this.next = next;
	}

	public CallTaker getNext() {
		return next;
	}

	public void setNext(CallTaker next) {
		this.next = next;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
