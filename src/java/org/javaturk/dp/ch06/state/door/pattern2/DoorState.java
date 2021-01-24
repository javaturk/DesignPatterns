package org.javaturk.dp.ch06.state.door.pattern2;

public interface DoorState {

	void open();
	
	void close();
	
	boolean isOpen();
}
