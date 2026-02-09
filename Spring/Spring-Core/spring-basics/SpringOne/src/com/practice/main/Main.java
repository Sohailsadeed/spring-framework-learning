package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc="/com/practice/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std= (Student) context.getBean("StdId");
		
		std.display();
	}

}
