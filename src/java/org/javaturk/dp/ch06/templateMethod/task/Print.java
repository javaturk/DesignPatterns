package org.javaturk.dp.ch06.templateMethod.task;

public class Print extends Task{

	public Print(String name, int interval, int repetation) {
		super(name, interval, repetation);
	}
	
	public void prepare() {
		System.out.println("*** Preparing printing! ***");
	}
	
	public void clean() {
		System.out.println("*** Cleaning printing environment. ***");
	}

	@Override
	public void doTask() {
		System.out.println("Printing task.");		
	}
}
