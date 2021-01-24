package org.javaturk.dp.ch07.nullObject.pattern;

public class Client {
	private AbstractObject abstractObject;
	private Factory factory;

	public Client(Factory factory) {
		this.factory = factory;
	}

	public void start() {
		abstractObject = factory.create();
		abstractObject.request();
	}
}
