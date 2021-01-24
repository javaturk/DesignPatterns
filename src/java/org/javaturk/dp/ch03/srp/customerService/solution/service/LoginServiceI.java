
package org.javaturk.dp.ch03.srp.customerService.solution.service;

import org.javaturk.dp.ch03.srp.domain.Customer;
import org.javaturk.dp.ch03.srp.customerService.solution.ex.*;

public interface LoginServiceI {

	/**
	 * Logs in the customer.
	 * @author akin
	 * @param tckn Tckn of the customer
	 * @param password Password of the customer
	 * @throws NoSuchCustomerException Throws when no customer with given tckn found
	 * @throws CustomerAlreadyLoggedException Throws when the customer has already been logged in
	 * @throws WrongCustomerCredentialsException Throws when the customer's provided apssword does not  match the existing one
	 * @throws MaxNumberOfFailedLoggingAttemptExceededException Throws when the number of the customer's attemps to log in with wrong passwords exceeds a certain amount.
	 * @throws CustomerLockedException Throws when no customer is locked
	 * @throws NoProperPasswordException 
	 * @throws ValidationException 
	 */
	public void login(String tckn, String password) throws NoSuchCustomerException, CustomerAlreadyLoggedException, WrongCustomerCredentialsException,
			MaxNumberOfFailedLoggingAttemptExceededException, CustomerLockedException, NoProperPasswordException, ValidationException;

	/**
	 * Method to logout the customer.
	 * @author akin
	 * @param customer Customer to log out.
	 * @return boolean True when the customer successfully logs out.
	 */
	public boolean logout(Customer customer);

}
