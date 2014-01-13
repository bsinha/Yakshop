/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.exception;

import com.yakshop.order.domain.OrderResponse;

/**
 * The Class PartialStockException.
 *
 * @author bsinha
 */
public class PartialStockException extends YakshopException{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8085629042066008320L;
	
	/** The order response. */
	private OrderResponse orderResponse;

	/**
	 * Instantiates a new partial stock exception.
	 */
	public PartialStockException() {
		super();
	}

	/**
	 * Instantiates a new partial stock exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public PartialStockException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new partial stock exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public PartialStockException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new partial stock exception.
	 *
	 * @param message the message
	 */
	public PartialStockException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new partial stock exception.
	 *
	 * @param cause the cause
	 */
	public PartialStockException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new partial stock exception.
	 *
	 * @param orderResponse the order response
	 */
	public PartialStockException(OrderResponse orderResponse) {
		this.orderResponse = orderResponse;
	}

	/**
	 * Gets the order response.
	 *
	 * @return the order response
	 */
	public OrderResponse getOrderResponse() {
		return orderResponse;
	}

	/**
	 * Sets the order response.
	 *
	 * @param orderResponse the new order response
	 */
	public void setOrderResponse(OrderResponse orderResponse) {
		this.orderResponse = orderResponse;
	}
	
	

	
}
