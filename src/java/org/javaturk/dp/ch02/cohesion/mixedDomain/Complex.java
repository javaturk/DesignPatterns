package org.javaturk.dp.ch02.cohesion.mixedDomain;

public class Complex {
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double abs() {
		return Math.hypot(real, imaginary);
	}

	public Complex plus(Complex b) {
		double newReal = real + b.real;
		double newImaginary = imaginary + b.imaginary;
		return new Complex(newReal, newImaginary);
	}

}
