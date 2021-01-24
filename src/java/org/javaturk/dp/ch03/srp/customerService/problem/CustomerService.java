package org.javaturk.dp.ch03.srp.customerService.problem;

import java.util.logging.Logger;

import org.javaturk.dp.ch03.srp.customerService.solution.dao.CustomerDAOI;
import org.javaturk.dp.ch03.srp.customerService.solution.ex.*;
import org.javaturk.dp.ch03.srp.customerService.solution.util.ATMLogger;
import org.javaturk.dp.ch03.srp.customerService.solution.util.ATMProperties;
import org.javaturk.dp.ch03.srp.domain.Account;
import org.javaturk.dp.ch03.srp.domain.Customer;


public class CustomerService {
	private CustomerDAOI customerDao;
	// Logged in customer
	private Customer currentCustomer;

	private int loginAttemptCount;

	protected Logger logger;

	public CustomerService() {
		logger = ATMLogger.getLogger();
	}
	
	public void createCustomer(Customer customer) {
		try {
			customerDao.createCustomer(customer);
		} catch (CustomerAlreadyExistsException e) {
			logger.severe("Customer already exist: " + e.getMessage());
		}
	}
	
	/**
	 * Retrieved the customer for given tckn from the db.
	 * @return Customer reteieved
	 * @throws NoSuchCustomerException Throws when no such customer for given tckn found
	 */
	public Customer retrieveCustomer(String tckn) throws NoSuchCustomerException {
		Customer customer = customerDao.retrieveCustomer(tckn);
		return customer;
	}

	public Customer refreshCustomer(Customer customer) throws NoSuchCustomerException {
		return customerDao.refreshCustomer(customer);
	}
	
	public void login(String tckn, String password)
			throws NoSuchCustomerException, CustomerLockedException, CustomerAlreadyLoggedException, WrongCustomerCredentialsException,
			MaxNumberOfFailedLoggingAttemptExceededException, ImproperCustomerCredentialsException, NoProperPasswordException {
		// First validate parameters
		validateTckn(tckn);
		validatePassword(password);

		// Now retrieve the customer from the db
		Customer customer = customerDao.retrieveCustomer(tckn);

		// If passwords match, customer hasn't already been locked nor logged in
		// Customer loggs in and it is now the currentCustomer
		if (customer.getPassword().equals(password) & !customer.isLocked() & !customer.isLoggedIn()) {
			customer.setLoggedIn(true);
			// customer.logsin is a property in atm.properties. If it is "yes"
			// database is updated when
			// a customer logs in. Updated part in db is CUSTOMERS.LOGGEDIN
			if (ATMProperties.getProperty("customer.logsin").equals("yes")) {
				logger.info(customer.getFirstName() + " " + customer.getLastName() + " logs in.");
				customerDao.updateCustomer(customer);
			}
			currentCustomer = customer;
		} else if (customer.isLoggedIn()) {
			throw new CustomerAlreadyLoggedException("Customer is already logged in. Please first log out.");
		} else if (customer.isLocked()) {
			throw new CustomerLockedException("Customer is locked. Please consult your admin.");
		} else if (!customer.getPassword().equals(password)) {
			loginAttemptCount++;
			if (loginAttemptCount == Integer.parseInt(ATMProperties.getProperty("customer.maxFailedLoginAttempt"))) {
				customer.setLocked(true);
				customerDao.updateCustomer(customer);
				loginAttemptCount = 0;
				throw new MaxNumberOfFailedLoggingAttemptExceededException("Max number of login attempt reached: " + loginAttemptCount);
			}
			else
				throw new WrongCustomerCredentialsException("TCKN/password is wrong.");
		}
	}

	public boolean logout(Customer customer) {
		boolean logout = false;

		customer.setLoggedIn(false);
		try {
			logout = customerDao.updateCustomer(customer);
			logout = true;
			logger.info("Customer logging out: " + customer);
		} catch (NoSuchCustomerException e) {
			logger.severe("Problem when logging out the customer " + e.getMessage());
		}

		// It should point to null
		customer = null;
		return logout;
	}

	public boolean lockCustomer(Customer customer) {
		boolean lock = false;
		customer.setLocked(true);
		try {
			lock = customerDao.updateCustomer(customer);
			logger.info("Customer locked: " + customer);
		} catch (NoSuchCustomerException e) {
			logger.severe("Problem when locking the customer " + e.getMessage());
		}
		return lock;
	}

	public Account getDefaultAccount(Customer customer) {
		return customer.getDefaultAccount();
	}

	public boolean changePassword(Customer customer, String password) throws NoProperPasswordException {
		boolean change = false;
		validatePassword(password);
		customer.setPassword(password);
		
		try {
			change = customerDao.updateCustomer(customer);
		} catch (NoSuchCustomerException e) {
			logger.severe("Problem when updating the password of the customer " + e.getMessage());
		}
		logger.info("Customer changed the password: " + customer);
		return change;
	}
	
	/**
	 * Retrieved current logged-in customer.
	 * @return Current logged-in customer
	 */
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}

	private boolean validatePassword(String password) throws NoProperPasswordException {
		boolean b1 = false;
		boolean b2 = false;
		int length = password.length();
		// Length check
		if (length < 6)
			throw new NoProperPasswordException("The password you provided doesn't satisfies the rules: " + password);

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

		// If both hold true
		if (b1 & b2)
			return true;
		else
			throw new NoProperPasswordException("The password you provided doesn't satisfies the rules: " + password);
	}

	/**
	 * This method validates tckn of the customer.
	 * 
	 * @param tckn Tckn of the customer.
	 * @throws ImproperCustomerCredentialsException Throws when the rules regarding the tckn are broken.
	 */
	private boolean validateTckn(String tckn) throws ImproperCustomerCredentialsException {
		boolean b = true;
		if (tckn == null | tckn.length() == 0)
			throw new ImproperCustomerCredentialsException("Empty TCKN not allowed.");

		String length = ATMProperties.getProperty("customer.tckn.length");
		int tcknLength = Integer.parseInt(length);
		if (tckn.length() < tcknLength)
			throw new ImproperCustomerCredentialsException("TCKN must have " + tcknLength + " characters.");
		return b;
	}
}
