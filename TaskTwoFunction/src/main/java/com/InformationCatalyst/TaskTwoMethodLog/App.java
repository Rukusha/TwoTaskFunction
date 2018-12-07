package com.InformationCatalyst.TaskTwoMethodLog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);
	  
	public static void main(String[] args) {
    	
        hello();

	}

	private static String hello() {
		
		logger.debug("In debug mode");
		logger.info("In info mode");
		logger.warn("In warning mode");
		logger.error("In error mode");
		
		String hello ="Hello";
    	logger.info(hello);
    	
    	world();
		return null;
	}

	private static String world() {
		
		String world ="World";
    	logger.info(world);
		return null;

	}
}

