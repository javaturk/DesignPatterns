package org.javaturk.dp.ch06.visitor.animal.pattern2;

public class Cat extends AbstractAnimal {
    public Cat(String name) {
		super(name);
	}

	public void eat() {
        System.out.println("Meeoow");
    }

	@Override
	public void accept(Feeder feeder) {
		if(feeder instanceof CatFeeder)
			feeder.feed(this);
		else
			System.out.println("Nop, I don't want this feeder");
	}
}