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
        	
        	String qry="Update student set name= ?1 where roll_no=?2";
        	Query query=manager.createNativeQuery(qry);
        	query.setParameter(1, "Chandu");
        	query.setParameter(2, 6);
        	int count= query.executeUpdate();
        	System.out.println("Updated "+count+" rows succesfully");
        	tn.commit();
        }
        catch(Exception e) {
        	e.printStackTrace();
        	tn.rollback();
        }
        finally {
        	em.close();
        	manager.close();
        }
    }
}
