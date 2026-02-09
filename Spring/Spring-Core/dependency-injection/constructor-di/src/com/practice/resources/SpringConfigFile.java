package com.practice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.beans.Address;
import com.practice.beans.Student;
import com.practice.beans.Subjects;
@Configuration
@ComponentScan("/com/practice/beans")
public class SpringConfigFile {
	
	@Bean("Add1")
	public Address createAddr1() {
		Address adr=new Address(127,"Godavarikhani",505209);
		return adr;
		
	}
	
	@Bean("Add2")
	
	public Address createAddr2() {
		Address adr=new Address(525,"hHyderabad",500075);
		return adr;
		
	}
	
	@Bean
	public Subjects createSubs() {
		List<String> subs=new ArrayList<>();
		subs.add("C++");
		subs.add("Java");
		subs.add("Python");
		subs.add("C#");
		Subjects sub=new Subjects(subs);
		
		return sub;
	}
	}
	
	
 