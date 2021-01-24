package org.javaturk.dp.ch06.strategy.sorting.pattern;

public class QuickSorter implements Sorter {

	public void sort(double[] a) {
		long start = System.currentTimeMillis();

		quicksort(a, 0, a.length - 1);

		long end = System.currentTimeMillis();
		System.out.println("Time to sort by QuickSort: " + (end - start) + " ms");
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