package org.javaturk.dp.ch06.strategy.sorting.problem;

import java.util.Arrays;

public class Sorter {
	
	public void sort(double[] list){
		int size = list.length;
		
		if(size < 100){  // Use Bubble sort
			System.out.println("Using BubbleSort!");
			double temp;
			int counter, index;
			int length = list.length;

			for (counter = 0; counter < length - 1; counter++) {
				for (index = 0; index < length - 1 - counter; index++) {
					if (list[index] > list[index + 1]) {
						temp = list[index];
						list[index] = list[index + 1];
						list[index + 1] = temp;
					}
				}
			}
		}
		else if(size < 1_000_000){ // Use quick sort.
			System.out.println("Using QuickSort!");
			quicksort(list, 0, list.length - 1);
		}
		else{ // Use Arrays to sort.
			System.out.println("Using JavaSort!");
			Arrays.sort(list);
		}
	}
	
	private void quicksort(double[] a, int left, int right) {
		if (right <= left)
			return;
		int i = partition(a, left, right);
		quicksort(a, left, i - 1);
		quicksort(a, i + 1, right);
	}
	
	private int partition(double[] a, int left, int right) {
		int i = left;
		int j = right;
		while (true) {
			while (a[i] < a[right])
				i++;
			while (isLess(a[right], a[--j]))
				if (j == left)
					break;
			if (i >= j)
				break;
			exchange(a, i, j);
		}
		exchange(a, i, right);
		return i;
	}

	private boolean isLess(double x, double y) {
		return (x < y);
	}

	private void exchange(double[] a, int i, int j) {
		double swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

}
