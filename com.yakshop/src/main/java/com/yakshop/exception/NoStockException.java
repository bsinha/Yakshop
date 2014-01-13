/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.exception;

/**
 * The Class NoStockException.
 *
 * @author bsinha
 */
public class NoStockException extends YakshopException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4987500640446943394L;

	/**
	 * Instantiates a new no stock exception.
	 */
	public NoStockException() {
		super();
	}

	/**
	 * Instantiates a new no stock exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public NoStockException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new no stock exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public NoStockException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new no stock exception.
	 *
	 * @param message the message
	 */
	public NoStockException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new no stock exception.
	 *
	 * @param cause the cause
	 */
	public NoStockException(Throwable cause) {
		super(cause);
	}

	
}
