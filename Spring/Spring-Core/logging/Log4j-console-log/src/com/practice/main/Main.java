package com.practice.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	public static void main(String[] suyg) {
		Logger logger= LogManager.getLogger("Main");
		
		logger.fatal("This is fatal");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.info("This is an info msg");
	}
}
	 