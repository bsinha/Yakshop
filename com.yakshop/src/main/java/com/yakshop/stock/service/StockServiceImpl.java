/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yakshop.herd.domain.xml.Herd;
import com.yakshop.herd.domain.xml.Labyak;

/**
 * The Class StockServiceImpl.
 *
 * @author bsinha
 */
@Service
public class StockServiceImpl implements StockService {
	
	/** The stock. */
	private static List<Herd> stock = new ArrayList<Herd>();

	/* (non-Javadoc)
	 * @see com.yakshop.stock.service.StockService#getWool(java.lang.Long)
	 */
	@Override
	public Double getWool(Long days) {
		/*BigDecimal elapsedDays = new BigDecimal(days);
		elapsedDays = elapsedDays.movePointLeft(2);*/
		List<Herd> herdList = getStock();
		double milk = 0d;
		for (Herd herd : herdList) {
			List<Labyak> labyakList = herd.getLabyak();
			for (Labyak labyak : labyakList) {
				milk += 8+labyak.getAge().doubleValue()*0.01;
			}
		}
		return milk * days;
	}

	/* (non-Javadoc)
	 * @see com.yakshop.stock.service.StockService#getMilk(java.lang.Long)
	 */
	@Override
	public Double getMilk(Long days) {
		List<Herd> herdList = getStock();
		double wool = 0d;
		for (Herd herd : herdList) {
			List<Labyak> labyakList = herd.getLabyak();
			for (Labyak labyak : labyakList) {
				wool += 50 - labyak.getAge().doubleValue()*0.03;
			}
		}
		return wool * days;
	}

	/* (non-Javadoc)
	 * @see com.yakshop.stock.service.StockService#addStock(com.yakshop.domain.Herd)
	 */
	@Override
	public int addStock(Herd herd) {
		stock.add(herd);
		return stock.size();
	}

	/* (non-Javadoc)
	 * @see com.yakshop.stock.service.StockService#getStock()
	 */
	public List<Herd> getStock() {
		return stock;
	}

	
}
