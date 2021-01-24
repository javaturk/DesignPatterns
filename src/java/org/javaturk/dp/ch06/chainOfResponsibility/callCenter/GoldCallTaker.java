package org.javaturk.dp.ch06.chainOfResponsibility.callCenter;

public class GoldCallTaker extends AbstractCallTaker{
	
	public GoldCallTaker(CallTaker next) {
		super(next);
	}

	@Override
	public void answer(Customer customer) {
		System.out.println("GoldCallTaker received a customer.");
		if (customer instanceof VipCustomer)
			next.answer(customer);
		else {
			customer.askAQuestion();
			customer.receiveAnswer("Here is your GOLD answer!");
		}
		System.out.println();
	}
}
