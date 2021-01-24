
package org.javaturk.dp.ch02.polymorphism;

public class ConfRoom implements Schedulable{

	@Override
	public int getObjectId() {
		return (int) (Math.random() * (2^31));
	}

	@Override
	public void notifyAboutActivity() {
		System.out.println("Notification from an conference room.");
	}
}