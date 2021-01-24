package org.javaturk.dp.ch07.nullObject.pattern;

public class Factory {

	public AbstractObject create() {
		int i = (int) (Math.random() * 2);
		AbstractObject o = switch (i) {
		case 0 -> new RealObject();
		case 1 -> new NullObject();
		default -> new RealObject();
		};

		return o;
	}
}
