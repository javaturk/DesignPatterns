package org.javaturk.dp.ch05.adapter.electricity.domain.us;

public class USPowerProvider implements USPowerSource {
	private boolean on;

	public void providePowerAt110V() {
		System.out.println("USPowerProvider provides electricity at 110V!");
	}

	public USPowerProvider() {
		System.out.println("USPowerProvider is up and running.");
	}

	public void pushSwitch() {
		if (!on) {
			on = true;
			System.out.println("USPowerProvider started to provide electricity.");
		} else {
			on = false;
			System.out.println("USPowerProvider stopped to provide electricity.");
		}
	}
}
