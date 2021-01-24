package org.javaturk.dp.ch06.chainOfResponsibility.callCenter;

public class StandardCallTaker extends AbstractCallTaker {

	public StandardCallTaker(CallTaker next) {
		super(next);
	}

	@Override
	public void answer(Customer customer) {
		System.out.println("StandardCallTaker received a customer.");
		if (customer instanceof GoldCustomer)
			next.answer(customer);
		else {
			customer.askAQuestion();
			customer.receiveAnswer("Here is your answer!");
		}
		System.out.println();
	}
}
