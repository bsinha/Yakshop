/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */
package com.yakshop.utility;

import org.springframework.web.multipart.MultipartFile;

/**
 * The Class UploadedFile.
 */
public class UploadedFile {
	
	/** The file. */
	private MultipartFile file;
	
	/**
	 * Gets the file.
	 *
	 * @return the file
	 */
	public MultipartFile getFile() {
		return file;
	}

	/**
	 * Sets the file.
	 *
	 * @param file the new file
	 */
	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
