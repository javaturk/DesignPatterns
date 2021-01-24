package org.javaturk.dp.ch05.adapter.electricity.twoWayAdapter;

import org.javaturk.dp.ch05.adapter.electricity.domain.tr.TurkishPowerSource;
import org.javaturk.dp.ch05.adapter.electricity.domain.us.USPowerSource;

public class TwoWayUSTurkishPowerAdapter implements TurkishPowerSource, USPowerSource {

	private USPowerSource usPowerSource;
	private TurkishPowerSource turkishPowerSource;

	private boolean on;

	private String powerSource;

	public TwoWayUSTurkishPowerAdapter(TurkishPowerSource turkishPowerSource) {
		this.turkishPowerSource = turkishPowerSource;
		powerSource = "tr";
	}

	public TwoWayUSTurkishPowerAdapter(USPowerSource usPowerSource) {
		this.usPowerSource = usPowerSource;
		powerSource = "us";
	}

	@Override
	public void providePowerAt110V() {
		if (powerSource.equals("us"))
			usPowerSource.providePowerAt110V(); // That's USPowerSource
		else
			convert220To110(); // That's TurkishPowerSource

	}

	@Override
	public void providePowerAt220V() {
		if (powerSource.equals("us"))
			convert110To220(); // That's USPowerSource
		else
			turkishPowerSource.providePowerAt220V(); // That's
														// TurkishPowerSource
	}

	public void pushSwitch() {
		if (!on) {
			on = true;
			if (powerSource.equals("us"))
				usPowerSource.pushSwitch();
			else
				turkishPowerSource.turnOn();
		} else {
			on = false;
			if (powerSource.equals("us"))
				usPowerSource.pushSwitch();
			else
				turkishPowerSource.turnOff();
		}
	}

	@Override
	public void turnOn() {
		if (!on) {
			if (powerSource.equals("us"))
				usPowerSource.pushSwitch();
			else
				turkishPowerSource.turnOn();
			on = true;
		}
	}

	@Override
	public void turnOff() {
		if (on) {
			if (powerSource.equals("us"))
				usPowerSource.pushSwitch();
			else
				turkishPowerSource.turnOff();
			on = false;
		}
	}

	private void convert110To220() {
		System.out.println("TwoWayUSTurkishPowerAdapter: Converting from USPowerSource to provide 220V");
	}

	private void convert220To110() {
		System.out.println("TwoWayUSTurkishPowerAdapter: Converting from TurkishPowerSource to provide 110V");
	}
}
