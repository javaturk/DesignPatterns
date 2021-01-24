package org.javaturk.dp.ch06.state.elevator;

public class Elevator implements ElevatorState{
	private ElevatorState state;
	
	public Elevator(ElevatorState state) {
		this.state = state;
	}
	
	public void setState(ElevatorState state) {
		this.state = state;
	}

	public void goDown() {
		state.goDown();
	}

	public void goUp() {
		state.goUp();
	}

	public void openDoor() {
		state.openDoor();
	}

	public void stop() {
		state.stop();
	}
}
