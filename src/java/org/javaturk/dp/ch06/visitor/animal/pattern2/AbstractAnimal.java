package org.javaturk.dp.ch06.visitor.animal.pattern2;

public abstract class AbstractAnimal implements Animal{
	private String name;

	public AbstractAnimal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
