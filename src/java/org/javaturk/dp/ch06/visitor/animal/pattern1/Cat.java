package org.javaturk.dp.ch06.visitor.animal.pattern1;

public class Cat implements Animal {
    public void eat() {
        System.out.println("Meeoow");
    }

	@Override
	public void accept(Feeder feeder) {
		feeder.feed(this);
	}
}