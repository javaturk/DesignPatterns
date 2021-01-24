package org.javaturk.dp.ch03.srp.customerService.solution.service;

import java.util.logging.Logger;

import org.javaturk.dp.ch03.srp.customerService.solution.util.ATMLogger;

/**
 * Base class for all service classes. It provides common objects and functionality.
 * @author akin
 *
 * @version $Revision: 1.0 $
 */
public abstract class AbstractService {
	protected Logger logger;
	
	/**
	 * Constructor for AbstractService.
	 */
	public AbstractService(){
		logger = ATMLogger.getLogger();
	}
}