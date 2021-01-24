package org.javaturk.dp.ch03.lsp.designByContract.taxi;

public class VipTaxi extends Taxi {

	public VipTaxi(String string) {
		super(string);
	}

	public boolean checkPrecondition(Customer customer) {
		return true;
	}

	@Override
	public VipService service() {
		return new VipService();
	}
}
