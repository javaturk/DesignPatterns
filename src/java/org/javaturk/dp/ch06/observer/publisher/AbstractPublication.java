package org.javaturk.dp.ch06.observer.publisher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractPublication implements Publication{
	
	protected String name;
	protected List<Subscriber> subscribers;

	protected AbstractPublication(String name) {
		this.name = name;
		subscribers = new ArrayList<Subscriber>();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	@Override
	public void listSubscribers() {
		Iterator<Subscriber> iterator = subscribers.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
