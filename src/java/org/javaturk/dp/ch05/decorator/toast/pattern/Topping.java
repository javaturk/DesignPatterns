package org.javaturk.dp.ch05.decorator.toast.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Topping implements Toastable{
	private String name;
	protected Toastable toastTopping;
	protected int price;
	
	private List<Topping> toppings = new ArrayList<>();
	
	public Topping(Toastable toastTopping, int price, String name){
		this.toastTopping = toastTopping;
		toppings.add(this);
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int calculatePrice() {
		return toastTopping.calculatePrice() + price;
	}
	
	@Override
	public List<Topping> getToppings() {
		 List<Topping> toppings = toastTopping.getToppings();
		 toppings.add(this);
		 return toppings;
	}

	public String getName() {
		return name;
	}

	public Toastable getToastTopping() {
		return toastTopping;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Topping [name=" + name + ", price=" + price + "]";
	}
}
