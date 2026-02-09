package com.practice.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class OfficeAddress implements Address{

	@Override
	public void getCity() {
		System.out.println("Bangalore");
	}

	@Override
	public String toString() {
		return "OfficeAddress Bangalore";
	}

}
