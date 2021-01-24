package org.javaturk.dp.ch06.visitor.animal.pattern1;

public interface Animal {
	void eat();
	
	void accept(Feeder feeder);
}
