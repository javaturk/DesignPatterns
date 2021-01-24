package org.javaturk.dp.ch05.decorator.toast.pattern;

public class Cheese extends Topping{

	public Cheese(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
