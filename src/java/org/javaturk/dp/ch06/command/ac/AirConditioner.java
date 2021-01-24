package org.javaturk.dp.ch06.command.ac;

public class AirConditioner {
	private int currentTemperature;
	private int targetTemperature;
	private boolean isOn = false;

	public AirConditioner(Temperature currentTemperature) {
		this.currentTemperature = currentTemperature.getTemperature();
	}

	public void turnOn(Temperature targetTemperature) {
		if (!isOn) {
			isOn = true;
			this.targetTemperature = targetTemperature.getTemperature();
			System.out.println("\nFan is turned on. Target temperature is: " + targetTemperature.getTemperature());
			if (this.targetTemperature < currentTemperature)
				turnOnCooler(targetTemperature);
			else if (this.targetTemperature > currentTemperature)
				turnOnHeater(targetTemperature);
		} else
			System.out.println("\nAirConditioner is already on!");
	}

	public void turnOff() {
		if (isOn) {
			System.out.println("AirConditioner is turned off.\n");
			isOn = false;
			currentTemperature = 0;
			targetTemperature = 0;
		} else
			System.out.println("AirConditioner is already off!\n");
	}

	public void turnOnHeater(Temperature targetTemperature) {
		if (isOn) {
			this.targetTemperature = targetTemperature.getTemperature();
			if (this.targetTemperature > currentTemperature) {
				currentTemperature = this.targetTemperature;
				System.out.println("Heater is turned on. Target temperature is: " + targetTemperature.getTemperature());
			}
		} else
			System.out.println("AirConditioner is off, please first turn it on!");
	}

	public void turnOnCooler(Temperature targetTemperature) {
		if (isOn) {
			this.targetTemperature = targetTemperature.getTemperature();
			if (this.targetTemperature < currentTemperature) {
				currentTemperature = this.targetTemperature;
				System.out.println("Cooler is turned on. Target temperature is: " + targetTemperature.getTemperature());
			}
		} else
			System.out.println("AirConditioner is off, please first turn it on!");
	}
}
