package org.javaturk.dp.ch06.command.ac;

public class HeatCommand implements Command {
	private AirConditioner ac;
	
	public HeatCommand(AirConditioner ac) {
		this.ac = ac;
	}
	
	public void execute(Temperature temperature) {
		ac.turnOnHeater(temperature);
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
