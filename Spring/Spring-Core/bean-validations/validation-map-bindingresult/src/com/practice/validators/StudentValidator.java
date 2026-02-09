package com.practice.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.practice.beans.Student;

import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class StudentValidator implements Validator{

	private Resource resource;
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	@Override
	public boolean supports(Class<?> clazz) {
		
		boolean b=Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		try {
	  
		 Student std=(Student) target;
		 
		Properties properties= PropertiesLoaderUtils.loadProperties(resource);
			
		 
		 if(std.getName().equals(null) || std.getName().equals(""))
		 {
			 errors.rejectValue("name", "key_name", properties.getProperty("key_name"));
		 }
		 if(std.getRollNo()<=0) {
			 errors.rejectValue("rollNo", "key_rollNo",properties.getProperty("key+rollNo"));
		 }
		 if(std.getPhNo().length()!=10) {
			 errors.rejectValue("phNo", "key_phNo", properties.getProperty("key_phNo"));
		 }	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
