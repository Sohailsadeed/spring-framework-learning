package com.practice.dao;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.practice.beans.Student;

public class StudentDaoImpl implements StudentDao{
	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}


	@Transactional(readOnly = false)
	@Override
	public void addStudent(Student std) {
		try {
		template.persist(std);
		System.out.println("Insert Success");
	}
		catch(Exception e) {
			System.out.println("Insert Failed");
			e.printStackTrace();
		}
	}
}
