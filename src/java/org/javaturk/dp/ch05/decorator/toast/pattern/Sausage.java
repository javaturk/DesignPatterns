package org.javaturk.dp.ch05.decorator.toast.pattern;

public class Sausage extends Topping{

	public Sausage(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
