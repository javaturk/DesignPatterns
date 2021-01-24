package org.javaturk.dp.ch06.command.lender.pattern;

public class Borrower implements Command {

	@Override
	public void execute(int money) {
		System.out.println("Spending for family!");
	}
}
