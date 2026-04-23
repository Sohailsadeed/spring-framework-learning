package com.practice.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.practice.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student std=new Student();
        
        std.setRollno(12);
        std.setName("Surya");
        std.setMarks(97);
        
        Configuration cfg=new Configuration(); 
        cfg.configure("/com/practice/resources/hibernate.cfg.xml");
        
       SessionFactory factory=cfg.buildSessionFactory();
       
        Session session=factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        try {
        	session.save(std);
        	System.out.println("Success");
        	transaction.commit();
        }
        catch(Exception e) {
        	System.out.println("Failed");
        	transaction.rollback();
        }
    }
}
