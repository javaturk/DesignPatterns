package org.javaturk.dp.ch03.srp.customerService.solution.service;

import java.io.Serializable;

import org.javaturk.dp.ch03.srp.customerService.solution.dao.CustomerDAOI;
import org.javaturk.dp.ch03.srp.customerService.solution.ex.*;
import org.javaturk.dp.ch03.srp.customerService.solution.util.Validator;
import org.javaturk.dp.ch03.srp.domain.*;


/**
 */
public class CustomerService extends AbstractService implements CustomerServiceI, Serializable {
	private CustomerDAOI customerDao;

	private Validator passwordValidator;

	// Logged in customer
	private Customer currentCustomer;

	public CustomerService() {
	}

	@Override
	public void checkIfCustomerAlreadyLoggedIn(Customer customer) throws CustomerAlreadyLoggedException {
		if (customer.isLoggedIn()) {
			throw new CustomerAlreadyLoggedException("Customer is already logged in. Please first log out.");
		}
	}

	@Override
	public void checkIfCustomerLocked(Customer customer) throws CustomerLockedException {
		if (customer.isLocked()) {
			throw new CustomerLockedException("Customer is locked. Please consult your admin.");
		}
	}

	/**
	 * Method lockCustomer.
	 * 
	 * @param customer
	 *            Customer
	 * @return boolean
	 * @see org.javaturk.dp.principles.srp.solution.service.teachmejava.atm.service.interfaces.CustomerServiceI#lockCustomer(Customer)
	 */
	@Override
	public boolean lockCustomer(Customer customer) {
		boolean lock = false;
		customer.setLocked(true);
		try {
			lock = customerDao.updateCustomer(customer);
		} catch (NoSuchCustomerException e) {
			logger.severe("Problem when locking the customer " + e.getMessage());
			e.printStackTrace();
		}
		return lock;
	}

	/**
	 * Method createCustomer.
	 * 
	 * @param customer
	 *            Customer
	 * @see org.javaturk.dp.principles.srp.solution.service.teachmejava.atm.service.interfaces.CustomerServiceI#createCustomer(Customer)
	 */
	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	/**
	 * Method getDefaultAccount.
	 * 
	 * @param customer
	 *            Customer
	 * @return Account
	 * @see org.javaturk.dp.principles.srp.solution.service.teachmejava.atm.service.interfaces.CustomerServiceI#getDefaultAccount(Customer)
	 */
	@Override
	public Account getDefaultAccount(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Changes the password.
	 * 
	 * @param customer Customer
	 * @param password New password
	 * @return boolean true if the password has been changed successfuly.
	 * @throws ValidationException 
	 * @see org.javaturk.dp.principles.srp.solution.service.teachmejava.atm.service.interfaces.CustomerServiceI#changePassword(Customer,
	 *      String)
	 */
	@Override
	public boolean changePassword(Customer customer, String password) throws ValidationException {
		boolean change = false;
		// First validate the password and then change it.
		passwordValidator.validate(password);
		customer.setPassword(password);
		try {
			change = customerDao.updateCustomer(customer);
		} catch (NoSuchCustomerException e) {
			logger.severe("Problem when updating the password of the customer " + e.getMessage());
			e.printStackTrace();
		}
		return change;
	}

	/**
	 * 
	 * @return Current logged-in customer * @see
	 *         com.teachmejava.atm.service.interfaces
	 *         .CustomerServiceI#getCurrentCustomer()
	 */
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}

	/**
	 * Method refreshCustomer.
	 * 
	 * @param customer
	 *            Customer
	 * @return Customer
	 * @throws NoSuchCustomerException
	 * @see org.javaturk.dp.principles.srp.solution.service.teachmejava.atm.service.interfaces.CustomerServiceI#refreshCustomer(Customer)
	 */
	@Override
	public Customer refreshCustomer(Customer customer) throws NoSuchCustomerException {
		return customerDao.refreshCustomer(customer);
	}
}
