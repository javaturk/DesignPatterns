package org.javaturk.dp.ch06.strategy.sorting.pattern;

public class BubbleSorter implements Sorter {
	public void sort(double[] list) {
		double temp;
		int counter, index;
		int length = list.length;

		long start = System.currentTimeMillis();
		for (counter = 0; counter < length - 1; counter++) {
			for (index = 0; index < length - 1 - counter; index++) {
				if (list[index] > list[index + 1]) {
					temp = list[index];
					list[index] = list[index + 1];
					list[index + 1] = temp;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Time to sort by BubbleSort: " + (end - start) + " ms");
	}
}