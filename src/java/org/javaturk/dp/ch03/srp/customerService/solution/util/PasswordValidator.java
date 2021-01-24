package org.javaturk.dp.ch03.srp.customerService.solution.util;

import org.javaturk.dp.ch03.srp.customerService.solution.ex.*;

public class PasswordValidator implements Validator{

	/**
	 * This method validates password of the customer.
	 * 
	 * @param password Password of the customer.
	 * @throws NoProperPasswordException Throws when the rules regarding the password are broken.
	 */
	@Override
	public void validate(String password) throws NoProperPasswordException {
		if (password == null | password.length() == 0)
			throw new NoProperPasswordException("Empty password not allowed.");

		int passwordMinLength = Integer.parseInt(ATMProperties.getProperty("customer.password.length.min"));
		int passwordMaxLength = Integer.parseInt(ATMProperties.getProperty("customer.password.length.max"));
		if (password.length() < passwordMinLength || password.length() > passwordMaxLength)
			throw new NoProperPasswordException("Password must have at least " + passwordMinLength + " and at most "
					+ passwordMaxLength + " characters");

		if (ATMProperties.getProperty("customer.password.checkDetails").equals("yes")) {
			// Now check if it has at least one char and one digit.
			boolean b1 = false;
			boolean b2 = false;

			int length = password.length();
			// Letter check
			for (int i = 0; i < length; i++) {
				char c = password.charAt(i);
				if (Character.isLetter(c)) {
					b1 = true;
					break;
				}
			}

			// Digit check
			for (int i = 0; i < length; i++) {
				char c = password.charAt(i);
				if (Character.isDigit(c)) {
					b2 = true;
					break;
				}
			}

			// If one of them is false throw an exception.
			if (!(b1 & b2))
				throw new NoProperPasswordException("The password you provided doesn't satisfies the rules: "
						+ password);
		}
	}
}
