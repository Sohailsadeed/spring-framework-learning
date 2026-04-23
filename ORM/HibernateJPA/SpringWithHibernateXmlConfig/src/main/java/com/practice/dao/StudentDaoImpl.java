package com.practice.dao;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.practice.beans.Student;

public class StudentDaoImpl implements StudentDao{
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly = false)
	@Override
	public void addStudent(Student std) {
		try {
		sessionFactory.getCurrentSession().persist(std);
		System.out.println("Insert Success");
	}
		catch(Exception e) {
			System.out.println("Insert Failed");
			e.printStackTrace();
		}
	}
	
	@Transactional(readOnly=false)
	@Override
	public void updateStudent(Student std) {

		try {
			sessionFactory.getCurrentSession().update(std);
			System.out.println("Details updates Successfully");
		}
		catch(Exception e) {
			System.out.println("Details not updated due to an error");
			e.printStackTrace();
		}
		
	}
	@Transactional(readOnly=false)
	@Override
	public Student getStudent(int id) {
		Student std=null;
		try {
			std= sessionFactory.getCurrentSession().get(Student.class, id);
		}
		catch(Exception e) {
			System.out.println("Details fetch failed due to an error");
			e.printStackTrace();
		}
		return std;
	}
	@Transactional(readOnly=false)
	@Override
	public void deleteStudent(Student std) {

		try {
			sessionFactory.getCurrentSession().delete(std);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
