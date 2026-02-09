package com.practice.main;

import java.io.IOException;
import java.util.Properties;

import com.practice.beans.Student;
import com.sun.tools.javac.launcher.Main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
       Student std=new Student();
       std.setRollno(5);
       std.setName("Charon");
       std.setMarks(95);
       
       Properties props=new Properties();
       props.load(App.class.getClassLoader().getResourceAsStream("com/practice/resources/properties.properties"));
      
       
       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("main-persistence-unit",props);
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
