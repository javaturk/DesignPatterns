package org.javaturk.dp.ch06.strategy.sorting.problem;

import org.javaturk.dp.ch06.strategy.sorting.ArrayCreator;

public class Test {
	private static Sorter sorter;

	public static void main(String[] args) {
		sorter = new Sorter();
		
		double[] list = ArrayCreator.createArray(50);
		sorter.sort(list);
		
		list = ArrayCreator.createArray(10_000_000);
		sorter.sort(list);
		
		list = ArrayCreator.createArray(100_000);
		sorter.sort(list);
	}
}
