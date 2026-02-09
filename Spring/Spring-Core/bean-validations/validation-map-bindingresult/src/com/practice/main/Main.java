package com.practice.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.practice.beans.Student;
import com.practice.validators.StudentValidator;

public class Main {
	public static void main(String[] args) {
		String configLocation="/com/practice/resources/applicationContext.xml";
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext(configLocation);
		
		Student std=(Student) ctx.getBean("stdId");
		
		Map<String,Object> map=new HashMap<String, Object>();
		MapBindingResult mapBindingResult=new MapBindingResult(map, "mymapobj");
		
		StudentValidator studValidator=(StudentValidator) ctx.getBean("stdValId");
		studValidator.validate(std, mapBindingResult);
		
		List<ObjectError> list=mapBindingResult.getAllErrors();
		
		if(list.isEmpty())
			std.display();
		else {
			for(ObjectError oe:list) {
				System.err.println(oe.getDefaultMessage());
			}
		}
		
	}
}
