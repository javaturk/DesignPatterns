package org.javaturk.dp.ch06.memento.pattern1;

public class Caretaker extends Thread{
	private Memento memento;
	
	public Caretaker(Memento memento) {
		this.memento = memento;
	}

	public void run() {
		for(int i = 0; i < 11; i++) {
			if(i != 0 && i % 5 == 0)
				memento.undo();
			else
				memento.save();
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
