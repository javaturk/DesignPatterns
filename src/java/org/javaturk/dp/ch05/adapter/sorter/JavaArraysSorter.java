
package org.javaturk.dp.ch05.adapter.sorter;

import java.util.Arrays;

import org.javaturk.dp.ch05.adapter.sorter.contract.*;

public class JavaArraysSorter implements JavaArraysSorterI {
	
	public JavaArraysSorter(){
		System.out.println("\n*** JavaArraysSorter ***");
	}

	@Override
	public void sort(int[] array) {
		Arrays.sort(array);
	}
}
