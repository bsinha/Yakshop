/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.herd.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yakshop.herd.domain.HerdResponse;
import com.yakshop.herd.domain.xml.Herd;
import com.yakshop.herd.domain.xml.Labyak;
import com.yakshop.stock.service.StockService;

/**
 * The Class HerdServiceImpl.
 *
 * @author bsinha
 */
@Service
public class HerdServiceImpl implements HerdService {
	
	/** The stock service. */
	@Autowired
	private StockService stockService;

	/* (non-Javadoc)
	 * @see com.yakshop.herd.service.HerdService#getHerdBasedOnElapsedTime(java.lang.Long)
	 */
	@Override
	public HerdResponse getHerdBasedOnElapsedTime(Long days) {
		List<Herd> herdList = stockService.getStock();
		
		BigDecimal elapsedDays = new BigDecimal(days);
		elapsedDays = elapsedDays.movePointLeft(2);
		
		HerdResponse response = new HerdResponse();
		List<com.yakshop.herd.domain.Herd> herdJList = new ArrayList<com.yakshop.herd.domain.Herd>();
		for (Herd herd : herdList) {
			List<Labyak> labyakList = herd.getLabyak();
			for (Labyak labyak : labyakList) {
				herdJList.add( new com.yakshop.herd.domain.Herd(labyak.getName(), 
						labyak.getAge().add(elapsedDays).doubleValue(), labyak.getAge().doubleValue()));
				
			}
			
		}
		response.setHerd(herdJList);
		
		return response;
	}

}
