package com.practice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private int houseNo;
	private String town;
	private int pin;
	
	public Address(@Value("124")int houseNo,@Value("GDK") String town,@Value("505208") int pin) {
		this.houseNo = houseNo;
		this.town = town;
		this.pin = pin;
	}


	public String toString() {
		
		return "#"+houseNo+", "+town+", "+pin;
	}
}
