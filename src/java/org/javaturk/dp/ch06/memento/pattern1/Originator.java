package org.javaturk.dp.ch06.memento.pattern1;

public class Originator {
	private volatile String state;
	private Memento memento = new Memento();

	public Originator(String state) {
		this.state = state;
		memento.setOriginator(this);
	}

	public String getState() {
		return state;
	}

	public synchronized void setState(String state) {
		System.out.println("\nNew state: " + state);
		this.state = state;
	}

	public Memento getMemento() {
		return memento;
	}

	@Override
	public String toString() {
		return "Originator [state=" + state + "]";
	}	
}
