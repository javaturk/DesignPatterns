package org.javaturk.dp.ch05.decorator.toast.pattern;

public class Ketchup extends Topping{

	public Ketchup(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
