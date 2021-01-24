package org.javaturk.dp.ch05.adapter.electricity.domain.us;

public class USHomeApplicance {
	private String name;
	private USPowerSource usPowerSource;

	public USHomeApplicance(String name){
		this.name = name;
	}
	
	public void setPowerSource(USPowerSource usPowerSource) {
		this.usPowerSource = usPowerSource;
	}

	public void start() {
		System.out.println("USHomeApplicance " + name + " is turning on!");
		usPowerSource.pushSwitch();
	}

	public void stop() {
		System.out.println("USHomeApplicance " + name + " turning off!");
		usPowerSource.pushSwitch();
	}
}
