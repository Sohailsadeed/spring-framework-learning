package com.practice.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.beans.Address;
import com.practice.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createObj() {
		Address adr=new Address(123,"Hyderabad",500028);
		return adr;
	}
	
	@Bean("stdId")
	public Student createStudObj() {
		Student std=new Student(54,"Sohail",createObj());
		return std;
	}
}
