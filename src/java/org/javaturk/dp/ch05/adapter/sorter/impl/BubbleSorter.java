
package org.javaturk.dp.ch05.adapter.sorter.impl;

import org.javaturk.dp.ch05.adapter.sorter.contract.Sorter;

public class BubbleSorter implements Sorter {

	@Override
	public int[] sort(int[] list) {
		int temp;
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
		return list;
	}
}
