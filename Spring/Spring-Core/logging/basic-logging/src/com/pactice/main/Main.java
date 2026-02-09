package com.pactice.main;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
	public static void main(String[] args) {
		
		try {
			SimpleFormatter simpleFormatter=new SimpleFormatter();	
			ConsoleHandler consoleHandler= new ConsoleHandler();
			consoleHandler.setFormatter(simpleFormatter);
			FileHandler fileHandler=new FileHandler("D:\\demo.log");		
			fileHandler.setFormatter(simpleFormatter);	
			
			Logger logger=Logger.getLogger(Main.class.getName());
			logger.addHandler(consoleHandler);
//			logger.addHandler(fileHandler);
			logger.setUseParentHandlers(false);
			
			logger.log(Level.SEVERE, "Serever not responding");
			logger.log(Level.WARNING,"4 Failed attempts, 1 more attempt to block");
			System.out.println("End of logger");
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
