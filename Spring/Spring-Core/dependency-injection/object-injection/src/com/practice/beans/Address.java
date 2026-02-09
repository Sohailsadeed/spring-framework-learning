package com.practice.beans;

public class Address {
	private int houseNo;
	private String town;
	private int pin;
	
	public Address(int houseNo, String town, int pin) {
		this.houseNo = houseNo;
		this.town = town;
		this.pin = pin;
	}


	public String toString() {
		
		return "#"+houseNo+", "+town+", "+pin;
	}
}
