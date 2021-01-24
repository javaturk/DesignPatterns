package org.javaturk.dp.ch06.visitor.animal.problem;

public class Feeder {
	
//    public void feed(Dog d) {
//        d.eat();
//    }
//    
//    public void feed(Cat c) {
//        c.eat();
//    }
    
    public void feed(Animal a) {
    	if (a instanceof Dog) {
			Dog dog = (Dog) a;
			dog.eat();
		} else if (a instanceof Cat) {
			Cat cat = (Cat) a;
			cat.eat();
		}
    }
}