package org.javaturk.dp.ch06.state.elevator;

public interface ElevatorState {

	public void goUp();

	public void goDown();

	public void stop();

	public void openDoor();

}
