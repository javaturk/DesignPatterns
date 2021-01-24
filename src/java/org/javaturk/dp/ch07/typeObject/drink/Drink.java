
package org.javaturk.dp.ch07.typeObject.drink;

public class Drink {

	private DrinkType type;
	private String name;
	private String description;
	private double price;
	
	public Drink(DrinkType type, String name, String description) {
		this.type = type;
		this.name = name;
		this.description = description;
	}

	public DrinkType getType() {
		return type;
	}

	public void setType(DrinkType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return type.calculatePrice();
	}
}
