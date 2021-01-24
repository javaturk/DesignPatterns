package org.javaturk.dp.ch06.state.door.pattern2;

public class Door {
	private DoorState state;
	DoorStateManager dsm;

	public Door() {
		dsm = new DoorStateManager(this);
		dsm.closeDoor();
	}

	public void open() {
		state.open();
	}

	public void close() {
		state.close();
	}

	public boolean isOpen() {
		return state.isOpen();
	}

	void changeState(DoorState state) {
		this.state = state;
	}
}
