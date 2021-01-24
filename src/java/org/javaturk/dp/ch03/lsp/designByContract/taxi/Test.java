package org.javaturk.dp.ch03.lsp.designByContract.taxi;

public class Test {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Akin", 800);
		Taxi taxi = new Taxi("Zafer");
		customer1.call(taxi);
		Service service = taxi.service();
		System.out.println(service);
		
		Customer customer2 = new Customer("Yasemin", 1200);
		Taxi vipTaxi = new VipTaxi("Cemil");
		customer2.call(vipTaxi);
		Service vipService = vipTaxi.service();
		System.out.println(vipService);
	}
}
