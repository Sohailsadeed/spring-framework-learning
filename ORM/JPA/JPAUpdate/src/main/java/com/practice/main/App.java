package com.practice.main;

import com.practice.beans.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       
       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("main-persistence-unit");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction=entityManager.getTransaction();
       try {
    	   entityTransaction.begin();
    	   Student std=entityManager.find(Student.class, 3);
    	   std.setMarks(100);
    	   
    	 //  entityManager.merge(std);	//not required as entity will get automatically updated when setter methods is used
    	   
    	   entityTransaction.commit();
    	   System.out.println("Successful Update");
       }
       catch(Exception e) {
    	   e.printStackTrace();
    	   System.out.println("Update Failed");
    	   entityTransaction.rollback();
       }
       finally {
    	   entityManager.close();
    	   entityManagerFactory.close();
       }
    }
}
