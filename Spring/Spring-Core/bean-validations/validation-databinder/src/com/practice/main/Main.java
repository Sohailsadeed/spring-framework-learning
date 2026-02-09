package com.practice.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import com.practice.beans.Student;
import com.practice.validators.StudentValidator;

public class Main {
	public static void main(String[] args) {
		String configLocation="/com/practice/resources/applicationContext.xml";
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext(configLocation);
		
		Student std=(Student) ctx.getBean("stdId");
		
		DataBinder db=new DataBinder(std);//What to Validate-->std
		db.addValidators(new StudentValidator());//How to validate-->in the StudentValidator class
		db.validate(); //Start the validation
		
		List<ObjectError> list=db.getBindingResult().getAllErrors();//--BindingResult is the error container, so errors collected 
		
		if(list.isEmpty())
			std.display();
		else {
			for(ObjectError oe:list) {
				System.err.println(oe.getDefaultMessage());
			}
		}
		
		
	}
}
