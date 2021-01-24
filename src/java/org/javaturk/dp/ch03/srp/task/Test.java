package org.javaturk.dp.ch03.srp.task;

import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		
		SorterTaskFactory sorterTaskFactory = new SorterTaskFactory();
		// Sorter
		Sorter<Product> sorter = sorterTaskFactory.create();
		Collection<Product> list = null;
		// ...
		sorter.sort(list);

		// Thread
		Thread sorterThread = (Thread) sorter;
		sorterThread.run();

		// Comparable
		Comparable comparableSorter2 = (Comparable) sorterTaskFactory.create();
		Comparable comparableSorter1 = (Comparable) sorter;
		comparableSorter1.compareTo(comparableSorter2);
	}

}
