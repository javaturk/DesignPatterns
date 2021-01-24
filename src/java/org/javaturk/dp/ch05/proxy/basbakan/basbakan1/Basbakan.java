
package org.javaturk.dp.ch05.proxy.basbakan.basbakan1;

public class Basbakan {
	
	public void dertDinle(String dert) {
		System.out.println("Basbakan: Dinliyorum.");
		if(ayikla(dert))
			coz(dert);
	}

	public void isBul(String yakinim) {
		System.out.println("Basbakan: Bana boyle isteklerle gelmeyin.");
	}
	
	private boolean ayikla(String dert){
		boolean b = true;
		//...
		return b;
	}
	
	private void coz(String dert) {
		System.out.println("Basbakan: Bu derdi çözün: " + dert);
	}
}
