package org.javaturk.dp.ch02.cohesion.mixedDomain;

/**
 * http://jscience.org/api/org/jscience/mathematics/number/Real.html 
 * @author akin
 *
 */
public class Real {
	
	private int signifcant;
	private int error;
	private int exponent;
	
//	public static final Real NaN; 	// Holds a Not-a-Number instance (infinite error).
//	public static final Real ONE; 	// Holds the exact ONE instance.
//	public static final Real ZERO; 	// Holds the exact ZERO instance.
	
	public Real(int signifcant, int error, int exponent) {
		this.signifcant = signifcant;
		this.error = error;
		this.exponent = exponent;
	}

	public Real plus(Real real) {
		real = normalize(real);
		int newSignifcant = signifcant + real.signifcant;
		int newError = error + real.error;
		Real newReal = new Real(newSignifcant, newError, exponent);
		return newReal;
	}
	
	private Real normalize(Real real) {
		Real normalizedReal = null;
		// Business logic goes here.
		return normalizedReal;
	}
	
	

}
