package com.practice.beans;

public class Student {
	private int rollNo;
	private String name;
	private String email;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		System.out.println("Setter for rollno");
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setter for name");
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Setter for email");
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name: "+name+"\nrollNo: "+rollNo+"\nEmail: "+email);
	}
	
}
