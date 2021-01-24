package org.javaturk.dp.ch06.state.person;

public class HappyState implements EmotionalState {

	public String sayGoodbye() {
		return "Bye, friend!";
	}

	public String sayHello() {
		return "Hello, friend!";
	}

}