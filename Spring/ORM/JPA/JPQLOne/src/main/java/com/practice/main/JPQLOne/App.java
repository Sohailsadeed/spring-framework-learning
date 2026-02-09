package com.practice.main.JPQLOne;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.practice.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Properties props=new Properties();
    	props.load(App.class.getClassLoader().getResourceAsStream("com.practice.resources/properties.properties"));
    	
        EntityManagerFactory em=Persistence.createEntityManagerFactory("main-persistence-unit",props);
        EntityManager manager=em.createEntityManager();
        
        try {
        	String jpql_query="Select s from Student s";
        	Query query=manager.createQuery(jpql_query);
        	
        	List<Student> stdList=query.getResultList();
        	for(Student s:stdList) {
        		System.out.println("Id: "+s.getRollno());
        		System.out.println("Name: "+s.getName());
        		System.out.println("Marks: "+s.getMarks());
        		System.out.println("--------------------");
        	}
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
