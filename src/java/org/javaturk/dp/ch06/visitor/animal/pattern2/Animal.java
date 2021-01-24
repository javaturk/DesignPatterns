package org.javaturk.dp.ch06.visitor.animal.pattern2;

public interface Animal {
	void eat();
	
	String getName();
	
	void accept(Feeder feeder);
}
