package org.javaturk.dp.ch06.state.door.pattern2;

public class Test {

	public static void main(String[] args) {
		Door door = new Door();
		System.out.println("Initial: " + door.isOpen());
		door.close();
		System.out.println("After close(): " + door.isOpen());
		door.open();
		System.out.println("After open(): " + door.isOpen());
		door.open();
		System.out.println("After open(): " + door.isOpen());
		door.close();
		System.out.println("After close(): " + door.isOpen());
		door.open();
		System.out.println("After open(): " + door.isOpen());
		door.close();
		System.out.println("After close(): " + door.isOpen());
		door.close();
		System.out.println("After close(): " + door.isOpen());
	}
}
