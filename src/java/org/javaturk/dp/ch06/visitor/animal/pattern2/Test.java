package org.javaturk.dp.ch06.visitor.animal.pattern2;

public class Test {

	public static void main(String[] args) {
		Feeder dogFeeder = new DogFeeder();
		Feeder catFeeder = new CatFeeder();
		
		Animal a = new Dog("karabas");
		a.accept(dogFeeder);
//		a.accept(catFeeder);

		a = new Cat("sarman");
//		a.accept(dogFeeder);
		a.accept(catFeeder);
	}
}
