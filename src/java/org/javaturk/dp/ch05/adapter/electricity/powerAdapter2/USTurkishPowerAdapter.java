package org.javaturk.dp.ch05.adapter.electricity.powerAdapter2;

import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishPowerSource;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerSource;

/**
 * This adapter provides some extra functionality.
 * @author akin
 *
 */
public class USTurkishPowerAdapter implements TurkishPowerSource {
	private USPowerSource usPowerSource;
	
	public USTurkishPowerAdapter(USPowerSource usPowerSource){
		System.out.println("\nUSTurkishPowerAdapter: Converting from USPowerSource to TurkishPowerSource");
		this.usPowerSource = usPowerSource;
		convert110To220(usPowerSource);
	}

	@Override
	public void providePowerAt220V() {
		usPowerSource.providePowerAt110V();
		convert110To220(usPowerSource);
	}

	@Override
	public void turnOn() {
		usPowerSource.pushSwitch();
	}

	@Override
	public void turnOff() {
		usPowerSource.pushSwitch();
	}
	
	private void convert110To220(USPowerSource usPowerSource){
		check();
		System.out.println("USTurkishPowerAdapter: Converting from 110V to 220V");
		regulateVoltage();
	}
	
	/**
	 * Some extra functionality the adaptor provides.
	 */
	private void check(){
		System.out.println("Making some safety checks.");
	}
	
	/**
	 * Some extra functionality the adaptor provides.
	 */
	private void regulateVoltage(){
		System.out.println("Regulating the voltage.");
	}
}
