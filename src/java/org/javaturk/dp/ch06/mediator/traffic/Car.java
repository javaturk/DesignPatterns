
package org.javaturk.dp.ch06.mediator.traffic;

public class Car extends Thread implements Vehicle {
	private boolean moving;
	private Junction junction;
	private TrafficMediator mediator;

	public Car(String name, Junction junction, TrafficMediator mediator, boolean moving) {
		super(name);
		this.junction = junction;
		this.mediator = mediator;
		this.moving = moving;
		approach();
		mediator.receive(this);
	}
	
	@Override
	public void approach() {
		System.out.println("Car " + getName() + " is approaching to junction " + junction.getName());
	}

	@Override
	public void proceed() {
		System.out.println("Car " + getName() + " is proceeding through junction " + junction.getName());
		mediator.done(this);
	}

	@Override
	public void stopp() {
		moving = false;
		System.out.println("Car " + getName() + " has stopped.");
	}

	@Override
	public void waitForAWhile() {
		System.out.println("Car " + getName() + " is waiting.");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mediator.askPermitToPass(this);
	}
	
	@Override
	public void run() {
		System.out.println("Car " + getName() + " is asking permit to pass junction " + junction.getName());
		mediator.askPermitToPass(this);
	}
}
