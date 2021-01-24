
package org.javaturk.dp.ch06.mediator.traffic;

import java.util.ArrayList;
import java.util.List;

public class TrafficPolice implements TrafficMediator {
	private String name;
	private Junction junction;
	private List<Vehicle> vehicles;

	public TrafficPolice(String name, Junction junction) {
		this.name = name;
		this.junction = junction;
		vehicles = new ArrayList<>();
		System.out.println("TrafficPolice " + name + " created.");
	}

	@Override
	public void receive(Vehicle vehicle) {
		vehicle.stopp();
		vehicles.add(vehicle);
	}

	@Override
	public void askPermitToPass(Vehicle vehicle) {
		if (!junction.isBusy()) {
			junction.setBusy(true);
			vehicle.proceed();
		} else
			vehicle.waitForAWhile();
	}

	@Override
	public void done(Vehicle vehicle) {
		vehicles.remove(vehicle);
		junction.setBusy(false);
	}
}
