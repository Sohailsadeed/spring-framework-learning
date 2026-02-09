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

       try {
    	   Student std=entityManager.find(Student.class, 3);
    	   System.out.println("Name: "+std.getName());
    	   System.out.println("Roll_no: "+std.getRollno());
    	   System.out.println("Marks: "+std.getMarks());
       }
       catch(Exception e) {
    	   e.printStackTrace();
    	   System.out.println("Fetch Failed");
       }
       finally {
    	   entityManager.close();
    	   entityManagerFactory.close();
       }
    }
}
