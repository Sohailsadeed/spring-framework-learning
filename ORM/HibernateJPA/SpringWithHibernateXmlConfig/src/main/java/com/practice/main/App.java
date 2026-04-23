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
    	StudentDao stdDao= (StudentDao) context.getBean("myStudentDaoImpl");
    	Student st=stdDao.getStudent(13);
    	System.out.println(st);
    }
}
