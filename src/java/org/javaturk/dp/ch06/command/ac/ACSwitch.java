package org.javaturk.dp.ch06.command.ac;

public class ACSwitch {
	private AirConditioner ac;
	private Command turnOnCommand;
	private Command turnOffCommand;
	private Command turnOnHeaterCommand;
	private Command turnOnCoolerCommand;
	
	private Temperature startingTemperature = new Temperature(22);

	public ACSwitch() {
		ac = new AirConditioner(startingTemperature);
		
		turnOnCommand = new TurnOnCommand(ac);
		turnOffCommand = new TurnOffCommand(ac);
		turnOnHeaterCommand = new HeatCommand(ac);
		turnOnCoolerCommand = new CoolCommand(ac);
	}
	
	public void turnOn(int temperature) {
		turnOnCommand.execute(new Temperature(temperature));
	}
	
	public void turnOff() {
		turnOffCommand.execute(null);
	}
	
	public void turnOnHeater(int temperature) {
		turnOnHeaterCommand.execute(new Temperature(temperature));
	}
	
	public void turnOnCooler(int temperature) {
		turnOnCoolerCommand.execute(new Temperature(temperature));
	}
}
