package com.practice.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration config=new Configuration();
        config.configure("/com/practice/resources/hibernate.cgf.xml");
        
        SessionFactory factory= config.buildSessionFactory();
        
        Session sn= factory.openSession();
        
       
        
        try {
//        	Student std=sn.load(Student.class, 3);
        	Student std=sn.getReference(Student.class, 3);
        	System.out.println("Id: "+std.getRollno());
        	System.out.println("Name: "+std.getName());
        	System.out.println("Marks: "+std.getMarks());
        }
        catch(Exception e) {
        	System.out.println("Load Failed");
        }
        finally {
        	
        }
        
    }
}
