package org.javaturk.dp.ch03.lsp.square;

public class Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 10);
		System.out.println(r.calculateArea());
		System.out.println(r.calculateCircumference());
		System.out.println("Short side: " + r.getShortSide());
		System.out.println("Long side: " + r.getLongSide());

		System.out.println("************");

		Square s = new Square(5);
		System.out.println(s.calculateArea());
		System.out.println(s.calculateCircumference());
		System.out.println("Short side: " + s.getShortSide());
		System.out.println("Long side: " + s.getLongSide());

		System.out.println("************");
		System.out.println("Unit Testing");
		testAreaForRectangle(new Rectangle());
		testAreaForRectangle(new Square()); // Problem when called!
		testAreaForSquare(new Square()); // Requires RTTI
	}

	/**
	 * Problem when working with Square because it enforces more restrictive
	 * pre-condition beşng shortSide = longSide
	 * 
	 * @param rectangle
	 */
	public static void testAreaForRectangle(Rectangle rectangle) {
		rectangle.setShortSide(5);
		rectangle.setLongSide(10);
		double expectedArea = 5.0 * 10.0;
		double realArea = rectangle.calculateArea();
		assert expectedArea == realArea : "Problem! Needs to be " + expectedArea + " but found " + realArea;
	}

	/**
	 * Requires RTTI to work with a Square correctly!
	 * 
	 * @param rectangle
	 */
	public static void testAreaForSquare(Rectangle rectangle) {
		Square square = null;
		if (rectangle instanceof Square) {
			square = (Square) rectangle;
			square.setShortSide(5);
			square.setLongSide(10);
			double expectedArea = 10.0 * 10.0; // Long side overrides short side
			double realArea = rectangle.calculateArea();
			assert expectedArea == realArea : "Problem! Needs to be " + expectedArea + " but found " + realArea;
		}
	}
}
