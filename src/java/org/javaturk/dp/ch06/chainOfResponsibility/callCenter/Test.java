package org.javaturk.dp.ch06.chainOfResponsibility.callCenter;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private CallTaker first;
	private List<Customer> customers;

	public static void main(String[] args) {
		Test test = new Test();
		test.createCallTakers();
		test.createCustomers(5);
		test.startTakingCalls();

	}

	public void createCallTakers() {
		VipCallTaker vipCT = new VipCallTaker(null);
		GoldCallTaker goldCT = new GoldCallTaker(vipCT);
		StandardCallTaker standardCT = new StandardCallTaker(goldCT);
		first = standardCT;
	}

	public void createCustomers(int count) {
		customers = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			double random = Math.random();
			if (random < 0.33) {
				StandardCustomer customer = new StandardCustomer();
				customers.add(customer);
			} else if (random < 0.66) {
				GoldCustomer customer = new GoldCustomer();
				customers.add(customer);
			} else {
				VipCustomer customer = new VipCustomer();
				customers.add(customer);
			}
		}
	}
	
	private void startTakingCalls() {
		for (Customer customer : customers)
			first.answer(customer);
	}
}
