package org.javaturk.dp.ch06.command.ac;

public class CoolCommand implements Command {
	private AirConditioner ac;
	
	public CoolCommand(AirConditioner ac) {
		this.ac = ac;
	}
	
	public void execute(Temperature temperature) {
		ac.turnOnCooler(temperature);
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
