package org.javaturk.dp.ch07.nullObject.pattern.problem;

import org.javaturk.dp.ch07.nullObject.pattern.AbstractObject;
import org.javaturk.dp.ch07.nullObject.pattern.RealObject;

public class Factory {

	public AbstractObject create() {
		int i = (int) (Math.random() * 2);
		AbstractObject o = switch (i) {
		case 0 -> new RealObject();
		case 1 -> null;
		default -> new RealObject();
		};

		return o;
	}
}
