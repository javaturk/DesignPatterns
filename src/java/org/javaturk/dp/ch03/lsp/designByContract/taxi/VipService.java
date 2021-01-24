package org.javaturk.dp.ch03.lsp.designByContract.taxi;

public class VipService extends Service{
	private String vipDescription = "Wifi provided! ";
	
	@Override
	public String toString() {
		return "Service [description=" + vipDescription + description + "]";
	}
}
