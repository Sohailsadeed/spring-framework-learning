package com.practice.main;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.practice.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Properties props=new Properties();
    	props.load(App.class.getClassLoader().getResourceAsStream("com/practice/resources/props.properties"));
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("main-persistence-unit",props);
        EntityManager em=emf.createEntityManager();
        
        try {
        	TypedQuery<Student> query=em.createNamedQuery("getQuery", Student.class);
        	List<Student> stdList=query.getResultList();
        	for(Student std:stdList) {
        		System.out.println("Name: "+std.getName());
        		System.out.println("Roll_no: "+std.getRollno());
        		System.out.println("Marks: "+std.getMarks());
        		System.out.println("------------------");
        	}
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
        	emf.close();
        	em.close();
        }
        
    }
}
