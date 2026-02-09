package com.practice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("193")
	private int rollNo;
	@Value("Spparke")
	private String name;
	@Value("spparke@gmail.com")
	private String email;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		System.out.println("Name: "+name+"\nrollNo: "+rollNo+"\nEmail: "+email);
	}
}
