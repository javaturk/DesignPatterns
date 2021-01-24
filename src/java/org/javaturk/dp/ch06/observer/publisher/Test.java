package org.javaturk.dp.ch06.observer.publisher;

public class Test {

	public static void main(String[] args) {

		Publisher publisher = new Publisher();
		Publication newsweek = publisher.getNewsweek();
		Publication fourFourTwo = publisher.getFourFourTwo();

		Subscriber akin = new IndividualSubscriber("Akin");
		newsweek.addSubscriber(akin);
		fourFourTwo.addSubscriber(akin);

		Subscriber sevgi = new IndividualSubscriber("Sevgi");
		newsweek.addSubscriber(sevgi);

		Subscriber bank1 = new InstitutionalSubscriber("BankOne");
		newsweek.addSubscriber(bank1);

		publisher.publishNewsweek();
		publisher.publishFourFourTwo();
		publisher.publishNewsweek();
		publisher.publishNewsweek();
		publisher.publishFourFourTwo();

	}
}
