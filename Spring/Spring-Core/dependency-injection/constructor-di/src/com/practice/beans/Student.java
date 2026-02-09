package com.practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int rollNo;
	private String name;
	
	private Address address;
	
	private Subjects subjs;
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
		System.out.println(address);
		System.out.println(subjs);
	}
	
	@Autowired
	public Student(int rollNo, String name, @Qualifier("Add2")Address address, Subjects subjs) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.subjs = subjs;
	}
}
 