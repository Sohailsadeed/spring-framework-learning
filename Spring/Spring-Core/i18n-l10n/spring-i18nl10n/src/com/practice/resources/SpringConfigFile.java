package com.practice.resources;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.practice.bean.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean("msgSrcId")
	public ResourceBundleMessageSource createSrdBndl() {
		ResourceBundleMessageSource obj =new ResourceBundleMessageSource();
		obj.setBasename("com.practice.resources.MessageBundle");
		return obj;
	}
	
	@Bean("stdId")
	public Student createStd() {
		Student std= new Student();
		Scanner sc=new Scanner(System.in);
		String name,region;
		System.out.println("Enter name and region");
		name=sc.nextLine();
		region=sc.nextLine();
		std.setName(name);
		std.setRegion(region);
		std.setMessageSource(createSrdBndl());
		return std;
	}
}
