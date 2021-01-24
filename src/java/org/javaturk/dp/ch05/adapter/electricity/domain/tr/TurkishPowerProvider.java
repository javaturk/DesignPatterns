package org.javaturk.dp.ch05.adapter.electricity.domain.tr;

public class TurkishPowerProvider implements TurkishPowerSource {
	
	public TurkishPowerProvider(){
		System.out.println("TurkishPowerProvider is up and running.");
	}

	@Override
	public void providePowerAt220V() {
		System.out.println("I provide electricity at 220V. Be careful, there may be some casual interruptions!");
	}

	@Override
	public void turnOn() {
		System.out.println("TurkishPowerProvider started to provide electricity.");
	}

	@Override
	public void turnOff() {
		System.out.println("TurkishPowerProvider stopped to provide electricity.");
	}
}
