package org.javaturk.dp.ch06.command.lender.pattern;

public class Lender {
	public void lend(Command command, int money) {
		command.execute(money);
	}
}
