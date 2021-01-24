
package org.javaturk.dp.ch03.srp.customerService.solution.service;

import org.javaturk.dp.ch03.srp.domain.Account;
import org.javaturk.dp.ch03.srp.domain.Customer;
import org.javaturk.dp.ch03.srp.customerService.solution.ex.*;

public interface CustomerServiceI {

	/**
	 * Method lockCustomer.
	 * 
	 * @param customer
	 *            Customer
	 * @return boolean
	 */
	public boolean lockCustomer(Customer customer);

	/**
	 * Method changePassword.
	 * 
	 * @param customer
	 *            Customer
	 * @param newpassword
	 *            String
	 * @return boolean
	 * @throws ValidationException 
	 */
	public boolean changePassword(Customer customer, String newpassword) throws ValidationException;

	/**
	 * Method createCustomer.
	 * 
	 * @param customer
	 *            Customer
	 */
	public void createCustomer(Customer customer);

	/**
	 * Method getDefaultAccount.
	 * 
	 * @param customer
	 *            Customer
	 * @return Account
	 */
	public Account getDefaultAccount(Customer customer);

	/**
	 * Method getCurrentCustomer.
	 * 
	 * @return Customer
	 */
	public Customer getCurrentCustomer();

	/**
	 * Method refreshCustomer.
	 * 
	 * @param customer
	 *            Customer
	 * @return Customer
	 * @throws NoSuchCustomerException
	 */
	public Customer refreshCustomer(Customer customer) throws NoSuchCustomerException;

	void checkIfCustomerAlreadyLoggedIn(Customer customer) throws CustomerAlreadyLoggedException;

	void checkIfCustomerLocked(Customer customer) throws CustomerLockedException;
}