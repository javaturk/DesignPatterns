package org.javaturk.dp.ch07.nullObject.pattern;

public class NullObject extends AbstractObject {

	@Override
	public void request() {
		System.err.println("Doing nothing.");
	}
}
