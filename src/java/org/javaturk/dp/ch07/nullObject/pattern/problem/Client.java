package org.javaturk.dp.ch07.nullObject.pattern.problem;

import org.javaturk.dp.ch07.nullObject.pattern.AbstractObject;

public class Client {
	private AbstractObject abstractObject;
	private Factory factory;

	public Client(Factory factory) {
		this.factory = factory;
	}

	public void start() {
		abstractObject = factory.create();
		if(abstractObject != null)
			abstractObject.request();
		else
			System.err.println("Null object!");
	}
}
