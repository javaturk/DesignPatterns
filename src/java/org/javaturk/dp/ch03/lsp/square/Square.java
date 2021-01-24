package org.javaturk.dp.ch03.lsp.square;

public class Square extends Rectangle{
	
	public Square() {
	}
	
	public Square(int side) {
		super(side, side);
	}
	
	@Override
	public void setShortSide(int shortSide) {
		this.shortSide = shortSide;
		this.longSide = shortSide;
	}

	@Override
	public void setLongSide(int longSide) {
		this.shortSide = longSide;
		this.longSide = longSide;
	}
}
