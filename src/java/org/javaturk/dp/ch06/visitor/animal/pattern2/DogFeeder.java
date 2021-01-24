package org.javaturk.dp.ch06.visitor.animal.pattern2;

public class DogFeeder implements Feeder{

	@Override
	public void feed(Animal a) {
		System.out.println("Feeding the dog " + a.getName());
	}

}
