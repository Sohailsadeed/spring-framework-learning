package com.practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DemoStudent")
public class Student {
	private Address address;
	
	public Student(@Autowired(required = false)Address address) {
		super();
		this.address = 	address;
	}
	public void details() {
		System.out.println("Details: "+address);
	}
}
	