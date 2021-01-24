package org.javaturk.dp.ch06.command.ac;

public class TurnOnCommand implements Command {
	private AirConditioner ac;
	
	public TurnOnCommand(AirConditioner ac) {
		this.ac = ac;
	}
	
	public void execute(Temperature temperature) {
		ac.turnOn(temperature);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}
}
