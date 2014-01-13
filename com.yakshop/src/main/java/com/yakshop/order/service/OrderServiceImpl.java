package com.yakshop.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yakshop.exception.NoStockException;
import com.yakshop.exception.PartialStockException;
import com.yakshop.order.domain.CustomerOrder;
import com.yakshop.order.domain.Order;
import com.yakshop.order.domain.OrderResponse;
import com.yakshop.stock.service.StockService;

@Service
public class OrderServiceImpl implements OrderService {

	/** The stock service. */
	@Autowired
	private StockService stockService;

	/**
	 * Purchase order.
	 *
	 * @param customerOrder the customer order
	 * @param elapsedDays the elapsed days
	 * @return the order response
	 */
	public OrderResponse purchaseOrder(CustomerOrder customerOrder, Long elapsedDays) {
		OrderResponse orderResponse = new OrderResponse();
		
		Order order = customerOrder.getOrder();
		int orderedMilk = order.getMilk();
		int orderedSkins = order.getSkins();
		
		double stockMilk = stockService.getMilk(elapsedDays);
		double stockSilk = stockService.getWool(elapsedDays);
		
		if(orderedMilk > stockMilk) {
			if(orderedSkins > stockSilk) {
				throw new NoStockException("Requested Stock Not Available !!!");
			} else {
				orderResponse.setSkins((int)stockSilk);
				throw new PartialStockException(orderResponse);
			}
		}  else {
			if(orderedSkins > stockSilk) {
				orderResponse.setMilk(stockMilk);
				throw new PartialStockException(orderResponse);
			} else {
				orderResponse.setMilk(stockMilk);
				orderResponse.setSkins((int)stockSilk);
			}
		}
		return orderResponse;
	}


}
