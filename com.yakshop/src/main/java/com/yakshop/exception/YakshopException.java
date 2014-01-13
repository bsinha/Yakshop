/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.exception;

/**
 * The Class YakshopException.
 */
public class YakshopException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2014079301624256228L;

	/**
	 * Instantiates a new yakshop exception.
	 */
	public YakshopException() {
		super();
	}

	/**
	 * Instantiates a new yakshop exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public YakshopException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new yakshop exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public YakshopException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new yakshop exception.
	 *
	 * @param message the message
	 */
	public YakshopException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new yakshop exception.
	 *
	 * @param cause the cause
	 */
	public YakshopException(Throwable cause) {
		super(cause);
	}

}
