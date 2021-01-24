package org.javaturk.dp.ch06.visitor.animal.pattern2;

public class Dog extends AbstractAnimal {
    public Dog(String name) {
		super(name);
	}

	public void eat() {
        System.out.println("Woof");
    }

	@Override
	public void accept(Feeder feeder) {
		if(feeder instanceof DogFeeder)
			feeder.feed(this);
		else
			System.out.println("Nop, I don't want this feeder");
	}
}