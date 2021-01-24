package org.javaturk.dp.ch06.state.door.pattern1;

public abstract class AbstractDoorState implements DoorState {
	protected Door door;
	protected boolean open;

	protected DoorState openState;
	protected DoorState closedState;
	
	public AbstractDoorState(boolean open) {
		this.open = open;
	}
	
	@Override
	public void setClosedState(DoorState closedState) {
		this.closedState = closedState;
	}

	@Override
	public void setOpenState(DoorState openState) {
		this.openState = openState;
	}

	@Override
	public boolean isOpen() {
		return open;
	}

	@Override
	public void setDoor(Door door) {
		this.door = door;
	}
}
