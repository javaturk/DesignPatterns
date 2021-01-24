package org.javaturk.dp.ch06.memento.pattern2;

public class Caretaker extends Thread{
	private Originator.Memento memento;
	
	public Caretaker(Originator.Memento memento) {
		this.memento = memento;
	}

	public void run() {
		for(int i = 0; i < 10; i++) {
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
