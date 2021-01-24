package org.javaturk.dp.ch06.state.door.problem;

public class Door {
	private boolean open;
	
	public Door(boolean open) {
		this.open = open;
	}

	public boolean isOpen() {
		return open;
	}

	public void open() {
		if (!open)
			open = true;
		else
			System.out.println("Door is already open.");
	}
	
	public void close() {
		if (open)
			open = false ;
		else
			System.out.println("Door is already closed.");
	}
}
