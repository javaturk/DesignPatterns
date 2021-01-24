package org.javaturk.dp.ch05.adapter.electricity.powerAdapter2;

import org.javaturk.dp.ch05.adapter.electricity.domain.tr.Appliance;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishHomeAppliance;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.*;

public class Test1 {

	public static void main(String[] args) {
		USPowerSource usPowerSource = new USPowerProvider();
		USTurkishPowerAdapter uSTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);
		
		System.out.println();
		
		Appliance turkishMixer = new TurkishHomeAppliance("Mixer");
		turkishMixer.setPowerSource(uSTurkishPowerAdapter);
		turkishMixer.start();
		turkishMixer.stop();
		
		System.out.println();
		
		Appliance turkishBroom = new TurkishHomeAppliance("Broom");
		turkishBroom.setPowerSource(uSTurkishPowerAdapter);
		turkishBroom.start();
		turkishBroom.stop();
	}
}
