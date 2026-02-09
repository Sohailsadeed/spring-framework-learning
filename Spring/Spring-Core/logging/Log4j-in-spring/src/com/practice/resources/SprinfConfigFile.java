package com.practice.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.beans.Student;

@Configuration
public class SprinfConfigFile {
	@Bean("stdId")
	public Student createObj() {
		Student std=new Student();
		std.setName("SOHAIL");
		std.setRollNo(13);
		return std;
	}
	
}
