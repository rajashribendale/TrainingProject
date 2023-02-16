package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class studetails {
	public static final Logger LOGGER=LogManager.getLogger(studetails.class);
	
	public void checkStudentData(student student) {
		LOGGER.info("Check Student Method Call...!");
	}
}
