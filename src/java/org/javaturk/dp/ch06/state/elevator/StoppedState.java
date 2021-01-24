package org.javaturk.dp.ch06.state.elevator;

public class StoppedState implements ElevatorState {

	public void goDown() {
		System.out.println("Going down.");
	}

	public void goUp() {
		System.out.println("Going up.");
	}

	public void openDoor() {
		System.out.println("Door is open.");
	}

	public void stop() {
		System.out.println(":)");
	}
}
