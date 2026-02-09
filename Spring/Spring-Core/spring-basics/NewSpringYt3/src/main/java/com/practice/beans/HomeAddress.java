package com.practice.beans;

import org.springframework.stereotype.Component;

@Component("homeAddress")
public class HomeAddress implements Address {

	@Override
	public void getCity() {
		System.out.println("Hyderabad");	
	}

	@Override
	public String toString() {
		return "HomeAddress Hyderabad";
	}
}
