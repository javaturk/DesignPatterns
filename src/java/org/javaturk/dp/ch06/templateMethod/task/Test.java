package org.javaturk.dp.ch06.templateMethod.task;

public class Test {

	public static void main(String[] args) {
		Task task = new Print("Printing", 1, 10);
		task.run();

	}
}
