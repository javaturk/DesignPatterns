package org.javaturk.dp.ch07.nullObject.pattern.optional;

import java.util.Optional;

public class Factory {

	public Optional<AbstractObject> create() {
		int i = (int) (Math.random() * 2);
		Optional<AbstractObject> o = switch (i) {
		case 0 -> Optional.of(new RealObject());
		case 1 -> Optional.ofNullable(null);
		default -> Optional.of(new RealObject());
		};

		return o;
	}
}
