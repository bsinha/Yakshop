/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.herd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yakshop.herd.domain.HerdResponse;
import com.yakshop.herd.service.HerdService;

/**
 * Controller class to handle herd details based on elapsed time in days.
 *
 * @author bsinha
 */
@Controller
@RequestMapping("/herd")
public class HerdController {

	/** The herd service. */
	@Autowired
	private HerdService herdService;
	
	/**
	 * Gets the herd by elapsed time.
	 *
	 * @param days the days
	 * @return the herd by elapsed time
	 */
	@RequestMapping("/{days}")
	@ResponseBody
	public HerdResponse getHerdByElapsedTime(@PathVariable Long days){
		return herdService.getHerdBasedOnElapsedTime(days);
	}
}
