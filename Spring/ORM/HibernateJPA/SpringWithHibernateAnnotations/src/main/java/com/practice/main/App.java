package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.beans.Student;
import com.practice.dao.StudentDao;
import com.practice.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	StudentDao stdDao= context.getBean(StudentDao.class);
    	Student st=stdDao.getStudent(13);
    	System.out.println(st);
    }
}
