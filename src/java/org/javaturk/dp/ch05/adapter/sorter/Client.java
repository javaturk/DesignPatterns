
package org.javaturk.dp.ch05.adapter.sorter;

import org.javaturk.dp.ch05.adapter.sorter.contract.Sorter;

public interface Client {

	public void setSorter(Sorter sorter);

	public int[] sortArray(int[] array);

}
