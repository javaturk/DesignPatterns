package org.javaturk.dp.ch05.adapter.electricity.powerAdapter1;

import org.javaturk.dp.ch05.adapter.electricity.domain.tr.Appliance;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishHomeAppliance;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishPowerSource;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerProvider;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerSource;

public class Test1 {

	public static void main(String[] args) {
		USPowerSource usPowerSource = new USPowerProvider();
		USTurkishPowerAdapter uSTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);
		
		System.out.println();
		
		Appliance shaver = new TurkishHomeAppliance("Shaver");
		shaver.setPowerSource(uSTurkishPowerAdapter);
		shaver.start();
		shaver.stop();
		
		System.out.println();
//		
//		Appliance turkishBroom = new TurkishHomeAppliance("Broom");
//		turkishBroom.setPowerSource(uSTurkishPowerAdapter);
//		turkishBroom.start();
//		turkishBroom.stop();
	}
}
