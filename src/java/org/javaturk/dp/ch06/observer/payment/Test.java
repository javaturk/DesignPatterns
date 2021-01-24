package org.javaturk.dp.ch06.observer.payment;

import java.util.Observer;

public class Test {

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice(10_000);
		
		Observer boss = new Boss();
		Observer accountant = new Accountant();
		
		invoice1.addObserver(boss);
		invoice1.addObserver(accountant);
		
		invoice1.payBalance(5000);
		invoice1.deleteObserver(boss);
		
		invoice1.payBalance(2000);
		
		
//		Invoice invoice2 = new Invoice(500);
//		invoice2.addObserver(accountant);
//		invoice2.payBalance(500);
		
	}
}
