package com.practice.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean("StudentOne")
	public Student createStudent() {
		Student std= new Student();
		std.setEmail("varun@gmail.com");
		std.setName("Varun");
		std.setRollNo(124);
		return std;
	}
	
}
