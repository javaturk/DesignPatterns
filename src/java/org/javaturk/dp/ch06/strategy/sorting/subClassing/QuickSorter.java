package org.javaturk.dp.ch06.strategy.sorting.subClassing;

public class QuickSorter extends BubbleSorter {

	public void sort(double[] a) {
		System.out.println("Using QuickSort!");
		quicksort(a, 0, a.length - 1);
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
