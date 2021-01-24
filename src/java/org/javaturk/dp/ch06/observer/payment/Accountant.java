package org.javaturk.dp.ch06.observer.payment;

import java.util.Observable;
import java.util.Observer;

public class Accountant implements Observer {

	public void update(Observable arg0, Object arg1) {
		System.out.println("\nAccountant has received an update.");
		Invoice invoice = (Invoice) arg0;
		System.out.println(invoice);
	}
}
