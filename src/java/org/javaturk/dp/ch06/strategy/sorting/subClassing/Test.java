package org.javaturk.dp.ch06.strategy.sorting.subClassing;

import org.javaturk.dp.ch06.strategy.sorting.ArrayCreator;

public class Test {
	private static Sorter sorter;

	public static void main(String[] args) {
		sorter = new BubbleSorter();
		double[] list = ArrayCreator.createArray(50);
		sorter.sort(list);
		
		sorter = new JavaSorter();
		list = ArrayCreator.createArray(1_000_000);
		sorter.sort(list);
		
		sorter = new QuickSorter();
		list = ArrayCreator.createArray(200_000);
		sorter.sort(list);
	}
}
