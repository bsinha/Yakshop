/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yakshop.stock.domain.StockResponse;
import com.yakshop.stock.service.StockService;

/**
 * The Class StockController.
 *
 * @author bsinha
 */
@Controller
@RequestMapping("/stock")
public class StockController {
	
	/** The stock service. */
	@Autowired
	private StockService stockService;
	
	/**
	 * Gets the by elapsed days.
	 *
	 * @param days the days
	 * @return the by elapsed days
	 */
	@RequestMapping("/{days}")
	@ResponseBody
	public StockResponse getByElapsedDays(@PathVariable Long days){
		StockResponse stock = new StockResponse(stockService.getMilk(days), stockService.getWool(days).intValue());
		return stock;
	}

}
