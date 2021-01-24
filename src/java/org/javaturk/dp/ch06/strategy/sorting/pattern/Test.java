package org.javaturk.dp.ch06.strategy.sorting.pattern;

import org.javaturk.dp.ch06.strategy.sorting.ArrayCreator;

public class Test {
	private static SortingContext context = new SortingContext();
	
	public static void main(String[] args) {
		
		double[] array = ArrayCreator.createArray(900_000);
		context.sortDouble(array);
		
		array = ArrayCreator.createArray(99);
		context.sortDouble(array);
		
		array = ArrayCreator.createArray(10_000_000);
		context.sortDouble(array);
		
	}
}