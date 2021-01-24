package org.javaturk.dp.ch03.srp.task;

import java.util.Collection;

public class SorterTask<T> implements Job, Runnable, Sorter<T>, Comparable<T> {

	@Override
	public int compareTo(T t) {
		return 0;
	}

	@Override
	public void sort(Collection<T> collection) {
		
	}

	@Override
	public void doIt() {
		
	}

	@Override
	public void run() {
		
	}
}
