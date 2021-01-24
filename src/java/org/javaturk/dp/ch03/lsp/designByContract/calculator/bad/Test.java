package org.javaturk.dp.ch03.lsp.designByContract.calculator.bad;

public class Test {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		testCalculator(calculator);
		System.out.println("***********");
		calculator = new PositiveCalculator();
		testCalculator(calculator);
		System.out.println("***********");
		calculator = new PositiveCalculator();
		testPositiveCalculator(calculator);
	}

	public static void testCalculator(Calculator calculator) {
		int i = -3;
		int j = 7;
		int expected = i + j;
		int result = calculator.add(i, j);
		assert expected == result : "Problem! Needs to be " + expected + " but found " + result;
	}

	/**
	 * Requires RTTI to work with a PositiveCalculator correctly!
	 * 
	 * @param rectangle
	 */
	public static void testPositiveCalculator(Calculator calculator) {
		PositiveCalculator positiveCalculator = null;
		if (calculator instanceof PositiveCalculator) {
			positiveCalculator = (PositiveCalculator) calculator;
			int i = -3;
			int j = 7;
			int expected = i + j;
			int result = calculator.add(i, j);
			assert expected == result : "Problem! Needs to be " + expected + " but found " + result;
		}
	}
}
