package org.javaturk.dp.ch05.decorator.toast.problem;

public class CheseToast extends AbstractToast{

	public CheseToast() {
		name = "Chese Toast";
	}

	@Override
	public int calculatePrice() {
		return 5;
	}
}
