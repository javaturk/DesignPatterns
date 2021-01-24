
package org.javaturk.dp.ch05.adapter.sorter.impl;

import org.apache.commons.math3.util.MathArrays;
import org.javaturk.dp.ch05.adapter.sorter.contract.ApacheSorterI;

public class ApacheSorter implements ApacheSorterI {
	
	public ApacheSorter(){
		System.out.println("\n*** ApacheSorter ***");
	}

	@Override
	public void sortInPlace(double[] x, double[]... yList) {
		MathArrays.sortInPlace(x);
	}
}
