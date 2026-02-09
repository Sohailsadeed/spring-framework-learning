package com.practice.main;

import com.practice.beans.Student;
import com.practice.dao.StudentDao;
import com.practice.dao.StudentDaoImpl;

public class Main {
	public static void main(String[] args) {
		Student std=new Student();
		std.setRollno(4);
		std.setName("Surya");
		std.setMarks(100);
		
		StudentDao dao=new StudentDaoImpl();
	
		boolean status=dao.addStudentDetails(std);
		if(status)
			System.out.println("Insert successful");
		else
			System.out.println("Insert failes");
		
		Student stdId=dao.getStudentDetails(4);
		System.out.println(stdId);
	}
	
}
