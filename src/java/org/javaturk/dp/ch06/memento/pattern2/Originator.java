package org.javaturk.dp.ch06.memento.pattern2;

import java.util.ArrayList;
import java.util.List;

public class Originator {
	private volatile String state;
	private Memento memento = new Memento();

	public Originator(String state) {
		this.state = state;
		memento.setOriginator(this);
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

	class Memento {
		private Originator originator;
		private List<String> states;
		private int position = 0;

		public Memento() {
//			states = Collections.synchronizedList(new ArrayList<String>());
			states = new ArrayList<>();
		}

		public void setOriginator(Originator originator) {
			this.originator = originator;
		}

		public synchronized void save() {
			String state = originator.state;
			System.out.println("Memento: Saving state: " + state);
			states.add(state);
			position++;
		}

		public synchronized void undo() {
			int currentPosition = position;
			currentPosition -= 2;
			String previousState = states.get(currentPosition);
			originator.setState(previousState);
			System.err.println("Memento: Undoing to: " + previousState);
		}
	}
}
