package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.beans.Student;
import com.practice.dao.StudentDao;
import com.practice.dao.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/com/practice/resources/applicationContext.xml");
        StudentDao stdImpl=context.getBean("studentDao",StudentDao.class);
        Student std=stdImpl.getStudent(3);
        System.out.println("Name: "+std.getName());
        System.out.println("Roll no: "+std.getRollno());
        System.out.println("Marks: "+std.getMarks());
        
        std.setName("Laddu");
        stdImpl.updateStudent(std);
        
        stdImpl.deleteStudent(3);
        std.setName("90");
        stdImpl.insertStudent(std);
        
    }
}
