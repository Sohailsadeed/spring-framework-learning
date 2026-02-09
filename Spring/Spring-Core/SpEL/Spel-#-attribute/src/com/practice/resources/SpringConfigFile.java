package com.practice.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.beans.Address;
import com.practice.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean("addrId")
	public Address createAddr() {
		Address address=new Address();
		address.setCity("Godavarikhani");
		address.setHouseno(121);
		address.setPincode(505209);
		return address;
	}
	
	@Bean("stdId")
	public Student createObj(@Value("#{addrId}") Address address) {
		
		Student std=new Student();
		std.setAddress(address);
		std.setName("Sohail");
		std.setRollno(21);
		
		return std;
	}
}
