package com.practice.beans;

public class Address {
	private int houseNo;
	private String town;
	private int pin;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public String toString() {
		
		return "#"+houseNo+", "+town+", "+pin;
	}
}
