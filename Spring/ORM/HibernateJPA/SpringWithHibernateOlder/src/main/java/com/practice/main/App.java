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
    	Student std=new Student();
    	std.setName("Surya");
    	std.setRollno(17);
    	std.setMarks(99);
    	ApplicationContext context=new ClassPathXmlApplicationContext("/com/practice/resources/applicationContext.xml");
    	StudentDao stdDao= (StudentDao) context.getBean("myStudentDaoImpl");
    	stdDao.addStudent(std);
    }
}
