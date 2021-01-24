package org.javaturk.dp.ch03.srp.task;

public class SorterTaskFactory {

	public Sorter<Product> create() {
		return new SorterTask();
	}
}
