package org.javaturk.dp.ch05.adapter.electricity.domain.tr;

public interface Appliance {
	
	public void setPowerSource(TurkishPowerSource powerSource);
	
	public void start();
	
	public void stop();

}
