package org.javaturk.dp.ch02.elevator;

import org.javaturk.dp.ch02.elevator.domain.GetterSetterElevator;

public class GetterSetterElevatorTest {
	private static  GetterSetterElevator getterSetterElevator = new GetterSetterElevator();

	public static void main(String args[]) {
//		privElevator.doorOpen = true; // passengers get on
		getterSetterElevator.setDoorOpen(true);
//		privElevator.doorOpen = false; // doors close
		// go down to currentFloor 0 (below bottom of building)
		getterSetterElevator.setDoorOpen(false);
//		privElevator.currentFloor--;
		getterSetterElevator.setCurrentFloor(getterSetterElevator.getCurrentFloor() + 1);
//		privElevator.currentFloor++;

		// jump to currentFloor 7 (only 5 floors in building)
//		privElevator.currentFloor = 7;
		getterSetterElevator.setCurrentFloor(7);
//		privElevator.doorOpen = true; // passengers get on/off
		getterSetterElevator.setDoorOpen(true);
//		privElevator.doorOpen = false;
		getterSetterElevator.setDoorOpen(false);
//		privElevator.currentFloor = 1; // go to the first floor
		getterSetterElevator.setCurrentFloor(1);
//		privElevator.doorOpen = true; // passengers get on/off
		getterSetterElevator.setDoorOpen(true);
//		privElevator.currentFloor++; // elevator moves with door open
		getterSetterElevator.setCurrentFloor(getterSetterElevator.getCurrentFloor() + 1);
//		privElevator.doorOpen = false;
		getterSetterElevator.setDoorOpen(false);
//		privElevator.currentFloor--;
		getterSetterElevator.setCurrentFloor(getterSetterElevator.getCurrentFloor() - 1);
//		privElevator.currentFloor--;
		getterSetterElevator.setCurrentFloor(getterSetterElevator.getCurrentFloor() - 1);
	}
}
