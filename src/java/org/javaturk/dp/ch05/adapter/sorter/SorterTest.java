
package org.javaturk.dp.ch05.adapter.sorter;

import org.javaturk.dp.ch05.adapter.sorter.contract.Sorter;
import org.javaturk.dp.ch05.adapter.sorter.impl.*;

public class SorterTest {

	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9 };

		System.out.println("Original array:");
		printArray(array);
		
		Sorter bubbleSorter = new BubbleSorter();
		
		SorterClient client = new SorterClient();
		client.setSorter(bubbleSorter);
		int[] sortedArray = client.sortArray(array);
		
		System.out.println("Sorted array:");
		printArray(sortedArray);
	}

	public static void printArray(int[] array) {
		for (int i : array)
			System.out.print(i + " ");
	}
}
