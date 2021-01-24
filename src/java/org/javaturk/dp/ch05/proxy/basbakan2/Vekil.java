package org.javaturk.dp.ch05.proxy.basbakan2;

public class Vekil {
	private Basbakan basbakan = new Basbakan();

	public void dinle(String konu) {
		
	}
	
	private boolean ayikla(String konu) {
		// ...
		return true;
	}
	
	private void ilet(String konu) {
		basbakan.dertDinle(konu);
	}
}
