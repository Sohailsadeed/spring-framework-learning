package com.practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int rollNo;

	private String name;

	private Address address;

	
	
	public Student(@Value("125")int rollNo,@Value("Sohail") String name,@Autowired Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollNo);
		System.out.println("Address: "+address);
	}
	
}
