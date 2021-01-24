package org.javaturk.dp.ch06.state.person;

public class SadState implements EmotionalState {

	public String sayGoodbye() {
		return "Bye. Sniff, sniff.";
	}

	public String sayHello() {
		return "Hello. Sniff, sniff.";
	}

}