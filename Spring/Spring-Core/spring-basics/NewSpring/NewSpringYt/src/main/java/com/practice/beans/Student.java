package com.practice.beans;

import org.springframework.stereotype.Component;

@Component("DemoStudent")
public class Student {
	public void details() {
		System.out.println("PROVIDE STUDENT DETAILS");
	}
}
	