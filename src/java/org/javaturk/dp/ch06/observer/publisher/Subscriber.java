package org.javaturk.dp.ch06.observer.publisher;

public interface Subscriber {

	public String getName();

	public void receive(Publication publication);
}
