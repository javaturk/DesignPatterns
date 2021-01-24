package org.javaturk.dp.ch06.visitor.factory;


public class Test {

	public static void main(String[] args) {
		Company company = new Company(5);
		company.populateCompany();
		
		HealthVisitor hv = new HealthVisitor();
		
		company.setVisitor(hv);
		
		Boss boss = new Boss("Memet Emmi", 52);
		boss.accept(hv);
	}
}
