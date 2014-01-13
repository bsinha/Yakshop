/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.home.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.yakshop.exception.ErrorTO;
import com.yakshop.exception.YakshopException;
import com.yakshop.herd.domain.xml.Herd;
import com.yakshop.stock.service.StockService;
import com.yakshop.utility.FileValidator;
import com.yakshop.utility.UploadedFile;

/**
 * The Class HomeController.
 *
 * @author bsinha
 */

@Controller
public class HomeController {
	
	/** The stock service. */
	@Autowired
	private StockService stockService;

	/** The file validator. */
	@Autowired
	private FileValidator fileValidator;

	/**
	 * Render.
	 *
	 * @return the string
	 */
	@RequestMapping("/home")
	public String render() {
		return "home";
	}

	/**
	 * File uploaded.
	 *
	 * @param uploadedFile the uploaded file
	 * @param result the result
	 * @return the model and view
	 */
	@RequestMapping("/fileUpload")
	public ModelAndView fileUploaded(@ModelAttribute("uploadedFile") UploadedFile uploadedFile, BindingResult result) {
		InputStream inputStream = null;

		MultipartFile file = uploadedFile.getFile();
		fileValidator.validate(uploadedFile, result);

		String fileName = file.getOriginalFilename();

		if (result.hasErrors()) {
			return new ModelAndView("home");
		}

		try {
			inputStream = file.getInputStream();
			JAXBContext jaxbContext = JAXBContext.newInstance(Herd.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Herd herd = (Herd) jaxbUnmarshaller.unmarshal(inputStream);
			stockService.addStock(herd);
		} catch (IOException e) {
			throw new YakshopException(e);
		} catch (JAXBException e) {
			throw new YakshopException(e);
		}

		return new ModelAndView("showFile", "message", fileName);
	}

	/**
	 * Handle exception.
	 *
	 * @param exception the exception
	 * @return the model and view
	 */
	@ExceptionHandler(value = YakshopException.class)
	public ModelAndView handleException(YakshopException exception) {
		ModelAndView mv = new ModelAndView("error");
		ErrorTO error = new ErrorTO();
		error.setMessage(exception.getMessage());
		mv.addObject("error", error);
		return mv;
	}
}
