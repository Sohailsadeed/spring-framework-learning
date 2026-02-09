package com.practice.bean;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.MessageSource;

public class Student {
	private MessageSource messageSource;
	private String name;
	private String region;
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void display() {
		Locale locale=new Locale("en","US");
		System.out.println(messageSource.getMessage("get_key", new Object[] {name,region}, locale));
	}
	
}
