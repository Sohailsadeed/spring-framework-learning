package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.ServiceDao.StudentService;
import com.practice.ServiceDao.StudentServiceImpl;
import com.practice.bean.Student;
import com.practice.dao.StudentDaoImpl;
import com.practice.resources.SpringConfigFile;

public class Main {
	public static void main(String args[]) {
		
		Student std=new Student();
		std.setRollno(6);
		std.setName("Rahul");
		std.setMarks(99);
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		StudentService impl= context.getBean(StudentService.class);
		boolean status=impl.addStdDetailsService(std);
		if(status)
			System.out.println("Insert success");
		else
			System.out.println("Insert failed");
	}
}
