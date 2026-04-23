package com.practice.main.JPQLOne;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.practice.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Properties props=new Properties();
    	props.load(App.class.getClassLoader().getResourceAsStream("com.practice.resources/properties.properties"));
    	
        EntityManagerFactory em=Persistence.createEntityManagerFactory("main-persistence-unit",props);
        EntityManager manager=em.createEntityManager();
        
        try {
        	String jpql_query="Select s from Student s where s.id >= :stdId";
        	TypedQuery<Student> query=manager.createQuery(jpql_query, Student.class);
        	query.setParameter("stdId", 4);
        	
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
