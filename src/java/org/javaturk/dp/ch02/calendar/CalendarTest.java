package org.javaturk.dp.ch02.calendar;

import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calendar calendar = new Calendar();
		Date date = new Date();


		while (true) {
			System.out.println("Please enter a date:");
			System.out.print("Day as number: ");
			date.setDay(sc.nextInt());
			System.out.print("Month as in \"January\": ");
			date.setMonth(sc.next());
			System.out.print("Year: ");
			date.setYear(sc.nextInt());
			Date nextDay = calendar.nextDay(date);
			System.out.println("Next day: " + nextDay.getDay() + " " + nextDay.getMonth() + " " + nextDay.getYear());
		}
	}
}
