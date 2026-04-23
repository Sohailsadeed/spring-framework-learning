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
        
        Transaction trans=sn.beginTransaction();
        
        try {
        	Student std= sn.get(Student.class, 3);
        	std.setName("Sadeed");
//        	Student st=new Student();
//        	st.setRollno(4);
//        	st.setName("Rahul");
//        	st.setMarks(98);
        	sn.saveOrUpdate(std);
        	trans.commit();
        }
        catch(Exception e) {
        	System.out.println("Insert Failed");
        	trans.rollback();
        }
        finally {
        	
        }
        
    }
}
