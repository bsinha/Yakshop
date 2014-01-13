/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.herd.service;

import com.yakshop.herd.domain.HerdResponse;

/**
 * The Interface HerdService.
 *
 * @author bsinha
 */
public interface HerdService {
	
	/**
	 * Gets the herd based on elapsed time.
	 *
	 * @param days the days
	 * @return the herd based on elapsed time
	 */
	HerdResponse getHerdBasedOnElapsedTime(Long days);
}
