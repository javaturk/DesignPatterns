package org.javaturk.dp.ch06.memento.pattern2;

public class Test {

	private static Originator originator;
	private static Originator.Memento memento;

	public static void main(String[] args) {
		originator = new Originator("state-0");
		memento = originator.getMemento();
		
		OriginatorTrigger trigger = new OriginatorTrigger();
		trigger.start();

		Caretaker caretaker = new Caretaker(memento);
		caretaker.start();
	}

	static class OriginatorTrigger extends Thread {

		public void run() {
			for (int i = 1; i < 20; i++) {
				String state = "state-" + i;
//				System.out.println("***: " + state);
				originator.setState(state);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
