/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.stock.service;

import java.util.List;

import com.yakshop.herd.domain.xml.Herd;

/**
 * The Interface StockService.
 *
 * @author bsinha
 */
public interface StockService {
	
	/**
	 * Adds the stock.
	 *
	 * @param herd the herd
	 * @return the int
	 */
	int addStock(Herd herd);
	
	/**
	 * Gets the stock.
	 *
	 * @return the stock
	 */
	List<Herd> getStock();
	
	/**
	 * Gets the milk.
	 *
	 * @param elapsedDays the elapsed days
	 * @return the milk
	 */
	Double getMilk(Long elapsedDays);
	
	/**
	 * Gets the wool.
	 *
	 * @param elapsedDays the elapsed days
	 * @return the wool
	 */
	Double getWool(Long elapsedDays);

}
