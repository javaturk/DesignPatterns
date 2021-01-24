package org.javaturk.dp.ch06.observer.publisher;

import java.util.*;

public class FourFourTwo extends AbstractPublication {

	
	protected FourFourTwo(String name) {
		super(name);
	}

	public void publish(String date) {
		name = name + " - " + date;
		Iterator<Subscriber> iterator = subscribers.iterator();
		while(iterator.hasNext()) {
			Subscriber subscriber = iterator.next();
			subscriber.receive(this);
		}
	}

	public void listSubscribers() {
		Iterator iterator = subscribers.iterator();
		while (iterator.hasNext())
			System.out.println((Subscriber) iterator.next());
	}
}