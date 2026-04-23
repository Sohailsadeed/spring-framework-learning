package com.practice.main.JPQLOne;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.practice.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
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
        EntityTransaction tn=manager.getTransaction();
        
        tn.begin();
        
        try {
        	
        	String jpql_query="Insert into student values(:rollno, :name, :marks)";
        	Query query=manager.createNativeQuery(jpql_query);
        	query.setParameter("rollno", 6);
        	query.setParameter("name", "Pavan");
        	query.setParameter("marks", 94);
        	int count= query.executeUpdate();
        	System.out.println("Inserted "+count+" rows succesfully");
        	tn.commit();
        }
        catch(Exception e) {
        	e.printStackTrace();
        	tn.rollback();
        }
    }
}
