package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext("com.practice.beans");
        Student std= context.getBean(Student.class);
        std.details();
        
//        for(String name: context.getBeanDefinitionNames()) {
//        	
//        	System.out.println(name);
//        }
    }
}
	