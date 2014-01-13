/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.yakshop.exception.NoStockException;
import com.yakshop.exception.PartialStockException;
import com.yakshop.order.domain.CustomerOrder;
import com.yakshop.order.domain.OrderResponse;
import com.yakshop.order.service.OrderService;

/**
 * The Class OrderController.
 *
 * @author bsinha
 */
@Controller
@RequestMapping("/order")
public class OrderController {
	
	/** The order service. */
	@Autowired
	private OrderService orderService;
		
	/**
	 * Purchase order.
	 *
	 * @param days the days
	 * @param customerOrder the customer order
	 * @return the order response
	 */
	@RequestMapping(value="/{days}", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public OrderResponse purchaseOrder(@PathVariable Long days, @RequestBody CustomerOrder customerOrder/*, BindingResult result*/) {
		//orderValidator.validate(customerOrder,result);
		return orderService.purchaseOrder(customerOrder, days);
		
	}
	
	/**
	 * Render partial stock.
	 *
	 * @param exception the exception
	 * @return the order response
	 */
	@ExceptionHandler(PartialStockException.class)
	@ResponseStatus(HttpStatus.PARTIAL_CONTENT)
	@ResponseBody
	public OrderResponse renderPartialStock(PartialStockException exception) {
		OrderResponse orderResponse = exception.getOrderResponse();
		return orderResponse;
		
	}
	
	/**
	 * Render no stock.
	 *
	 * @param exception the exception
	 * @return the order response
	 */
	@ExceptionHandler(NoStockException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public OrderResponse renderNoStock(NoStockException exception) {
		OrderResponse orderResponse = new OrderResponse();
		return orderResponse;
	}

}
