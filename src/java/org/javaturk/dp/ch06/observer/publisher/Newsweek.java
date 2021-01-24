package org.javaturk.dp.ch06.observer.publisher;

import java.util.*;

public class Newsweek extends AbstractPublication {
	
	public Newsweek(String name) {
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
}
