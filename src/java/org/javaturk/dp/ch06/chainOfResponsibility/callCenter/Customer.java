package org.javaturk.dp.ch06.chainOfResponsibility.callCenter;

public interface Customer {

	public void askAQuestion();
	
	public void receiveAnswer(String answer);
}
