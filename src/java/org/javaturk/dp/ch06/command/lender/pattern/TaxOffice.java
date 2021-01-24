package org.javaturk.dp.ch06.command.lender.pattern;

public class TaxOffice implements Command {

	@Override
	public void execute(int money) {
		System.out.println("Receiving for the tax payment!");
	}
}
