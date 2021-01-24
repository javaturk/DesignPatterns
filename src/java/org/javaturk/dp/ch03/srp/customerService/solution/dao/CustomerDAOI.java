package org.javaturk.dp.ch03.srp.customerService.solution.dao;

import org.javaturk.dp.ch03.srp.domain.Customer;
import org.javaturk.dp.ch03.srp.customerService.solution.ex.*;

public interface CustomerDAOI {
	/**
	 * Method createCustomer.
	 * @param customer Customer
	 * @return boolean
	 * @throws CustomerAlreadyExistsException
	 */
	public boolean createCustomer(Customer customer) throws CustomerAlreadyExistsException;

	/**
	 * Method retrieveCustomer.
	 * @param tckn String
	 * @return Customer
	 * @throws NoSuchCustomerException
	 */
	public Customer retrieveCustomer(String tckn) throws NoSuchCustomerException;

	/**
	 * Method updateCustomer.
	 * @param customer Customer
	 * @return boolean
	 * @throws NoSuchCustomerException
	 */
	public boolean updateCustomer(Customer customer) throws NoSuchCustomerException;

	/**
	 * Method deleteCustomer.
	 * @param customer Customer
	 * @return boolean
	 * @throws NoSuchCustomerException
	 */
	public boolean deleteCustomer(Customer customer) throws NoSuchCustomerException;
	
	/**
	 * Method refreshCustomer.
	 * @param customer Customer
	 * @return Customer
	 * @throws NoSuchCustomerException
	 */
	public Customer refreshCustomer(Customer customer) throws NoSuchCustomerException;
}
