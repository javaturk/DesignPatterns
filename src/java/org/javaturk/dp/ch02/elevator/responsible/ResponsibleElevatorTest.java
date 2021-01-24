package org.javaturk.dp.ch02.elevator.responsible;


public class ResponsibleElevatorTest {
	public static void main(String[] args) {

		Elevator elevator = new ResponsibleElevator();
		elevator.openDoor();  // Get into the elevator
		elevator.go(Floor.FIFTH);

		elevator.openDoor(); // Somebody is coming :)
		elevator.go(Floor.FIRST);
		elevator.go(Floor.FIFTH);
	}
}
