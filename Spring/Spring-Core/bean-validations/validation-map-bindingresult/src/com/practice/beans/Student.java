package com.practice.beans;

public class Student {
	
	private int rollNo;
	private String name;
	private String phNo;
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
	public String getPhNo() {
		return phNo;
	}
	public void setEmail(String phNo) {
		this.phNo = phNo;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Pin: "+rollNo);
		System.out.println("PhNo: "+phNo);
	}
}
