package org.javaturk.dp.ch06.state.elevator;

public class GoingUpState implements ElevatorState {

	public void goDown() {
		System.out.println("Please first stop the elevator.");
	}

	public void goUp() {
		System.out.println(":)");
	}

	public void openDoor() {
		System.out.println("Please first stop the elevator.");
	}

	public void stop() {
		System.out.println("Stooping!");
	}
}
