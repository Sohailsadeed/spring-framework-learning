package com.practice.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.beans.Address;
import com.practice.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddObj() {
		Address adr=new Address();
		adr.setHouseNo(120);
		adr.setPin(507209);
		adr.setTown("Khammam");
		
		return adr;
	}
	
	@Bean("stdId")
	public Student createStudObj() {
		Student std=new Student();
		std.setAddress(createAddObj());
		std.setName("Kovidh");
		std.setRollNo(2);
		
		return std;
	}
}
