package com.practice.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.practice.beans.Student;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		boolean b=Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty");
		 Student std=(Student) target;
		 
//		 if(std.getName().equals(null) || std.getName().equals(""))
//		 {
//			 errors.rejectValue("name", "key_name", "Name is not valid");
//		 }
		 if(std.getRollNo()<=0) {
			 errors.rejectValue("rollNo", "key_rollNo","Rollno is not valid");
		 }
		 if(std.getPhNo().length()!=10) {
			 errors.rejectValue("phNo", "key_phNo", "Length of phone number should be 10");
		 }	 
		
	}

}
