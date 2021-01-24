package org.javaturk.dp.ch05.decorator.toast.pattern;

public class Salad extends Topping{

	public Salad(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
