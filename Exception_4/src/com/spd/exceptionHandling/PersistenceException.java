package com.spd.exceptionHandling;

/**
 * @author Satish Prasad
 *
 */
public class PersistenceException extends Exception{
	
	/**
	 * 
	 */
	public PersistenceException() {
		super();
	}
	
	/**
	 * @param message
	 * @param cause
	 */
	public PersistenceException(String message,Throwable cause) {
		super(message,cause);
	}
	

	/**
	 * @param message
	 */
	public PersistenceException(String message) {
		super(message);
		
	}

	/**
	 * @param cause
	 */
	public PersistenceException(Throwable cause) {
		super(cause);
		
	}
}
