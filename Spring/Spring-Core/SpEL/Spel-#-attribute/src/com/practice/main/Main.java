package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.beans.Student;
import com.practice.resources.SpringConfigFile;

public class Main {
	public static void main(String[] skdyg) {
		
//		ApplicationContext context= new ClassPathXmlApplicationContext("/com/practice/resources/applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std= (Student)context.getBean("stdId");
		
		std.display();
	}
}  
	