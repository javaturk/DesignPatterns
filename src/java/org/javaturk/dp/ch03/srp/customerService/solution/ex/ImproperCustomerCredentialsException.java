package org.javaturk.dp.ch03.srp.customerService.solution.ex;

/**
 * This exception is thrown when improper  customer credentials are provided when the custoemrs tries
 * to log in The custoemr credentials are tckn and password. If they are empty or are not provided as designated
 * in the requirements this exception si thrown. 
 * @author akin
 *
 */
public class ImproperCustomerCredentialsException extends ValidationException {
	private static final String  prefix = "Improper customer credentials are provided: ";
	public ImproperCustomerCredentialsException(String message){
		super(message);
	}
	
	public String getMessage(){
		return prefix + super.getMessage();
	}
}
