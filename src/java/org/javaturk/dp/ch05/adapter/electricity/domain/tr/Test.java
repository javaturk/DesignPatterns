package org.javaturk.dp.ch05.adapter.electricity.domain.tr;

public class Test {

	public static void main(String[] args) {
		TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();
		
		Appliance turkishMixer = new TurkishHomeAppliance("Mixer");
		turkishMixer.setPowerSource(turkishPowerSource);
		turkishMixer.start();
		turkishMixer.stop();
		
		System.out.println();
		
		Appliance turkishBroom = new TurkishHomeAppliance("Broom");
		turkishBroom.setPowerSource(turkishPowerSource);
		turkishBroom.start();
		turkishBroom.stop();
	}
}
