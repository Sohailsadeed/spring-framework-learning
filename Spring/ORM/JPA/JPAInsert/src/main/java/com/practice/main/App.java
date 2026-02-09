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
       Student std=new Student();
       std.setRollno(2);
       std.setName("Varun");
       std.setMarks(96);
       
       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("main-persistence-unit");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction=entityManager.getTransaction();
       try {
    	   entityTransaction.begin();
    	   entityManager.persist(std);
    	   entityTransaction.commit();
    	   System.out.println("Successful Insert");
       }
       catch(Exception e) {
    	   e.printStackTrace();
    	   System.out.println("Insert Failed");
    	   entityTransaction.rollback();
       }
       finally {
    	   entityManager.close();
    	   entityManagerFactory.close();
       }
    }
}
