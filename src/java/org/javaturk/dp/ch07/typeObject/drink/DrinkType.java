
package org.javaturk.dp.ch07.typeObject.drink;

public enum DrinkType {
	TEA(1), COFFEE(2), COKE(3), SODA(4), JUICE(5), MILK(6);
	private int no;

	private DrinkType(int no) {
		this.no = no;
	}

	public double calculatePrice() {
		double price = 0.0;

		switch (no) {
		case 1:
			price = calculatePriceForTea();
			break;
		case 2:
			price = calculatePriceForCoffee();
			break;
		case 3:
			price = calculatePriceForCode();
			break;
		case 4:
			price = calculatePriceForSoda();
			break;
		case 5:
			price = calculatePriceForJuice();
			break;
		case 6:
			price = calculatePriceForMilk();
			break;
		}

		return price;
	}

	private double calculatePriceForTea() {
		return 1.5;
	}

	private double calculatePriceForCoffee() {
		return 1.75;
	}

	private double calculatePriceForCode() {
		return 1.90;
	}

	private double calculatePriceForSoda() {
		return 1.5;
	}

	private double calculatePriceForJuice() {
		return 2;
	}

	private double calculatePriceForMilk() {
		return 1.2;
	}
}
