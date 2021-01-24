package org.javaturk.dp.ch06.visitor.factory;

public class HR {

	public Employee getAnEmployee() {
		Employee e = null;
		int i = (int) (10 * Math.random());
		switch (i) {
		case 0:
			e = new Employee(i+1, "Ali", 4, "Production");
			break;
		case 1:
			e = new Secretary(i+1, "Sevim", 9, "Sales", new Manager(12, "Kamil", 17, "Sales", "Sales"));
			break;
		case 2:
			e = new Engineer(i+1, "Burhan", 5, "Production", "Improving production.");
			break;
		case 3:
			e = new Manager(i+1, "Metin", 14, "Production", "Production");
			break;
		case 4:
			e = new Director(i+1, "Salih", 24, "Management", "Management", 4500);
			break;
		case 5:
			e = new Employee(i+1, "Firdevs", 4, "Production");
			break;
		case 6:
			e = new Secretary(i+1, "Ayse", 9, "Sales", new Manager(12, "Kamil", 17, "Sales", "Sales"));
			break;
		case 7:
			e = new Engineer(i+1, "Mahmut", 5, "Production", "Improving production.");
			break;
		case 8:
			e = new Manager(i+1, "İsmail", 14, "Production", "Production");
			break;
		case 9:
			e = new Director(i+1, "Zeynep", 14, "Management", "Management", 4500);
			break;
		}

		return e;
	}
}
