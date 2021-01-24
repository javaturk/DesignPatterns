package org.javaturk.dp.ch03.lsp.designByContract.taxi;

public class Customer {
	private String name;
	private int distance;

	public Customer(String string, int distance) {
		this.name = name;
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}
	
	public String getName() {
		return name;
	}

	public void call(Taxi taxi){
		taxi.take(this);
	}
	
	public void pay(Taxi taxi){
		System.out.println("paying taxi " + taxi.getName());
	}
}
