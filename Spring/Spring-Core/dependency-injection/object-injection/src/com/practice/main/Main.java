package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.beans.Student;
import com.practice.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
		String configLoc="/com/practice/resources/applicationConfig.xml";
		ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std= (Student) ctx.getBean("stdId");
		std.display();
		}
}
