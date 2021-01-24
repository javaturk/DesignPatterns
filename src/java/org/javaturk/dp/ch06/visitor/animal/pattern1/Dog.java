package org.javaturk.dp.ch06.visitor.animal.pattern1;

public class Dog implements Animal {
    public void eat() {
        System.out.println("Woof");
    }

	@Override
	public void accept(Feeder feeder) {
		feeder.feed(this);
	}
}