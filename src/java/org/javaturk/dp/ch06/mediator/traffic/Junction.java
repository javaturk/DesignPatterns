
package org.javaturk.dp.ch06.mediator.traffic;

public class Junction {
	private String name;
	private boolean busy;

	public Junction(String name) {
		this.name = name;
		busy = false;
		System.out.println("Junction " + name + " created.");
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public String getName() {
		return name;
	}
}
