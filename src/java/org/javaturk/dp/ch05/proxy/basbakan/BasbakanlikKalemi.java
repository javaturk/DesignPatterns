package org.javaturk.dp.ch05.proxy.basbakan;

public class BasbakanlikKalemi {
	
	private Basbakan basbakan;
	
	public BasbakanlikKalemi(Basbakan basbakan){
		this.basbakan = new VekilBasbakan(basbakan);
	}

	public Basbakan banaBasbakaniVer(){
		System.out.println("Başbakanlık Kalemi: Tabi efendim");
		return basbakan;
	}
}
