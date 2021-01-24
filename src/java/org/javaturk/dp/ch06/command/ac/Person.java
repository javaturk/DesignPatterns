package org.javaturk.dp.ch06.command.ac;

public class Person {

	private ACSwitch acSwitch;
	
	public Person(ACSwitch acSwitch) {
		this.acSwitch = acSwitch;
	}
	
	public static void main(String[] args) {
		ACSwitch acSwitch = new ACSwitch();
		Person person = new Person(acSwitch);
		person.action();
	}
	
	public void action() {
		int temperature = 20;
		
		acSwitch.turnOn(temperature);
		acSwitch.turnOff();
		
		acSwitch.turnOnCooler(18);
		acSwitch.turnOnHeater(25);
		
		acSwitch.turnOn(temperature);
		acSwitch.turnOnCooler(18);
		acSwitch.turnOnCooler(25);
		acSwitch.turnOnCooler(15);
		acSwitch.turnOnHeater(23);
		acSwitch.turnOnHeater(20);
		acSwitch.turnOnHeater(25);
		acSwitch.turnOff();
	}
	
}
