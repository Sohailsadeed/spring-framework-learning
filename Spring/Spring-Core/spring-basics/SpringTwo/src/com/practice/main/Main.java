package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.beans.Student;
import com.practice.resources.SpringConfigFile;
public class Main {
	public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
	
//	Student std= (Student) context.getBean("StdId3");
//	std.display();
	
	Student std= (Student) context.getBean(Student.class);
	std.display();
	
//	Student std= (Student) context.getBean("StudentOne");
//	std.display();
}
}
