/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.order.service;

import org.springframework.stereotype.Service;

import com.yakshop.order.domain.CustomerOrder;
import com.yakshop.order.domain.OrderResponse;

/**
 * The Class OrderService.
 */
@Service
public interface OrderService {
	
	OrderResponse purchaseOrder(CustomerOrder customerOrder, Long elapsedDays);
}
