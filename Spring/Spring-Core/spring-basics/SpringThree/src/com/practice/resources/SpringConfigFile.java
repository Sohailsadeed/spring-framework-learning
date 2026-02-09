package com.practice.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("/com/practice/beans")
//@ComponentScan({"com.practice.beans"})
@ComponentScan(basePackages= {"com.practice.beans"})
public class SpringConfigFile {

	
}
