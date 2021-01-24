package org.javaturk.dp.ch06.visitor.animal.pattern1;

public class Feeder {
	
    public void feed(Dog d) {
        d.eat();
    }
    
    public void feed(Cat c) {
        c.eat();
    }
    
//    public void feed(Animal a) {
//        a.eat();
//    }
}