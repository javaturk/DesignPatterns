package org.javaturk.dp.ch07.nullObject.pattern.optional;

import java.util.Optional;

public class Client {
	private AbstractObject abstractObject;
	private Factory factory;

	public Client(Factory factory) {
		this.factory = factory;
	}

	public void start() {
		Optional<AbstractObject> o = factory.create();
		if (o.isPresent()) {
			AbstractObject abstractObject = o.get();
			abstractObject.request();
		} else
			System.out.println("Nothing in there!");
	}
}
