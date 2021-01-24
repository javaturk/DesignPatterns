
package org.javaturk.dp.ch06.mediator.traffic;

public class Test {

	public static void main(String[] args) {
		Junction junction = new Junction("Flower");
		TrafficMediator police = new TrafficPolice("Mehmet", junction);

		System.out.println();
		
		int numberOfCars = 5;
		Thread[] cars = new Thread[numberOfCars];

		for (int i = 0; i < numberOfCars; i++) {
			Thread car = new Car("Car" + i, junction, police, true);
			cars[i] = car;
		}

		System.out.println();

		for (Thread car : cars)
			car.start();
	}
}
