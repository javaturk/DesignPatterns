package org.javaturk.dp.ch06.state.door.pattern2;

public class DoorStateManager {
	private Door door;
	
	private DoorState openState;
	private DoorState closedState;
	
	public DoorStateManager(Door door) {
		this.door = door;
		openState = new OpenDoor(this);
		closedState = new ClosedDoor(this);
	}

	public void changeState(DoorState newState) {
		door.changeState(newState);
	}

	public void closeDoor() {
		changeState(closedState);
	}

	public void openDoor() {
		changeState(openState);		
	}
}
