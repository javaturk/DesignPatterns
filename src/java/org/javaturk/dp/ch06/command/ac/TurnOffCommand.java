package org.javaturk.dp.ch06.command.ac;

public class TurnOffCommand implements Command {
	private AirConditioner ac;
	
	public TurnOffCommand(AirConditioner ac) {
		this.ac = ac;
	}
	
	public void execute(Temperature temperature) {
		ac.turnOff();
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
