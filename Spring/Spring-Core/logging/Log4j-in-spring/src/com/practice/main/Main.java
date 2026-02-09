package com.practice.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.beans.Student;
import com.practice.resources.SprinfConfigFile;

public class Main {
	public static void main(String[] drug) {
		 
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SprinfConfigFile.class);
		
		Logger logger=LogManager.getLogger("Main");
		logger.fatal("Fatal msg");
		logger.error("Error msg from logger");
		logger.warn("Warning!!");
		logger.info("Hello form INFO");
		Student std=(Student) ctx.getBean("stdId");
		
		System.out.println(std);
				
	}
}
