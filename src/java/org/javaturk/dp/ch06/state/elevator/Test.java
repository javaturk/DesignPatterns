package org.javaturk.dp.ch06.state.elevator;

public class Test {

	public static void main(String[] args) {
		Elevator elevator = new Elevator(new StoppedState());
		elevator.openDoor();
		
		elevator.setState(new GoingUpState());
		elevator.openDoor();
		elevator.goUp();
		elevator.goDown();
		
		elevator.setState(new StoppedState());
		elevator.openDoor();
		elevator.setState(new GoingDownState());
		elevator.goDown();
	}
}
