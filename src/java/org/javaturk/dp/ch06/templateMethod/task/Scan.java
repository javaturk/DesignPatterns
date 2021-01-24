package org.javaturk.dp.ch06.templateMethod.task;

public class Scan extends Task {

	public Scan(String name, int interval, int repetation) {
		super(name, interval, repetation);
	}

	@Override
	public void doTask() {
		System.out.println("I'm scanning!");
	}
}
