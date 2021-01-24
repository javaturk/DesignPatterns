package org.javaturk.dp.ch06.visitor.factory;

public class Boss {
	private String name;
	private int age;

	public Boss(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
