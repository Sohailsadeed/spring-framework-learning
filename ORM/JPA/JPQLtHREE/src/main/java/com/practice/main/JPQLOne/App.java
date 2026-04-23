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
        	String jpql_query="Select s.rollno, s.name from Student s where s.id >= :stdId";
        	TypedQuery<Object[]> query=manager.createQuery(jpql_query, Object[].class);
        	query.setParameter("stdId", 4);
        	
        	List<Object[]> objList=query.getResultList();
        	for(Object[] obj:objList) {
        		System.out.println("Id: "+obj[0]);
        		System.out.println("Name: "+obj[1]);
        		System.out.println("--------------------");
        	}
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
