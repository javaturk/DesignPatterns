package org.javaturk.dp.ch06.chainOfResponsibility.callCenter;

public class VipCallTaker extends AbstractCallTaker{

	public VipCallTaker(CallTaker next) {
		super(next);
	}

	@Override
	public void answer(Customer customer) {
		System.out.println("VipCallTaker received a customer.");
		customer.askAQuestion();
		customer.receiveAnswer("Here is your VIP answer!");
		System.out.println();
	}
}
