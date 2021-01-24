package org.javaturk.dp.ch05.adapter.electricity.problem2;

import org.javaturk.dp.ch05.adapter.electricity.domain.tr.HomeAppliance;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishHomeAppliance;
import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishPowerSource;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerSource;

/**
 * This handles the problem with extending the TurkishHomeAppliance.
 * @author akin
 *
 */
public class TurkishHomeApplianceCompatibleWithUSPowerSource extends TurkishHomeAppliance {
	private USPowerSource usPowerSource;
	private boolean turkishPowerSource;

	public TurkishHomeApplianceCompatibleWithUSPowerSource(String name) {
		super(name);
	}

	@Override
	public void setPowerSource(TurkishPowerSource powerSource) {
		this.powerSource = powerSource;
		turkishPowerSource = true;
	}

	public void setUSPowerSource(USPowerSource usPowerSource) {
		this.usPowerSource = usPowerSource;
		turkishPowerSource = false;
	}

	@Override
	public void start() {
		System.out.println("TurkishHomeAppliance " + name + " is starting!");
		if (turkishPowerSource)
			powerSource.turnOn();
		else
			usPowerSource.pushSwitch();
	}

	@Override
	public void stop() {
		System.out.println("TurkishHomeAppliance " + name + " stoping!");
		if (turkishPowerSource)
			powerSource.turnOff();
		else
			usPowerSource.pushSwitch();
	}
}
