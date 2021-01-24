
package org.javaturk.dp.ch05.adapter.sorter;

import org.javaturk.dp.ch05.adapter.sorter.contract.Sorter;

public class SorterClient implements Client {
	private Sorter sorter;

	@Override
	public void setSorter(Sorter sorter) {
		this.sorter = sorter;
	}

	@Override
	public int[] sortArray(int[] array) {
		sorter.sort(array);
		return array;
	}
}
