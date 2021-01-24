package org.javaturk.dp.ch06.observer.payment;

import java.util.Observable;

public class Invoice extends Observable {
	private static int count;
	private int no;
	private double balance;
	
	public Invoice(double balance){
		no = ++count;
		this.balance = balance;
	}
	
	public void payBalance(double amount){
		System.out.println("Some payment made.");
		balance = balance - amount;
		setChanged();
		notifyObservers();
	}

	@Override
	public String toString() {
		return "Invoice [balance=" + balance + ", no=" + no + "]";
	}
}
