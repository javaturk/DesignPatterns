package org.javaturk.dp.ch03.lsp.designByContract.calculator.bad;

/**
 * Counter example for design by contract. PositiveCalculator enforces a new
 * condition as a preceondition whereas its parent has no precondition.
 * 
 * @author akin
 *
 */
public class PositiveCalculator extends Calculator {

	public int add(int i, int j) {
		if (i <= 0 | j <= 0)
			return -1;
		return i + j;
	}
}
