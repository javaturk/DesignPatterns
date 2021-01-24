package org.javaturk.dp.ch06.observer.publisher;

public abstract class AbstractSubscriber implements Subscriber {
	protected String name;

	public AbstractSubscriber(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
