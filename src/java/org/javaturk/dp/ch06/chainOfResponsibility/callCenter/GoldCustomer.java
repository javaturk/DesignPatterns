package org.javaturk.dp.ch06.chainOfResponsibility.callCenter;

public class GoldCustomer extends AbstractCustomer {
	
	public void askAQuestion() {
		askAGoldQuestion();
	}

	private void askAGoldQuestion() {
		System.out.println("\n--- Gold Customer: Asking a GOLD question!");
	}
}
