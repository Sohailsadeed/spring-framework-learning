package com.practice.dao;

import org.springframework.transaction.annotation.Transactional;

import com.practice.beans.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class StudentDaoImpl implements StudentDao{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	@Transactional(readOnly = true)
	public Student getStudent(int id) {
		
		return entityManager.find(Student.class, id);
		
	}
	@Override
	@Transactional(readOnly=false)
	public void insertStudent(Student std) {
		try {
		entityManager.persist(std);
		System.out.println("Student detailed inserted successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error while Inserting Student Details");
		}
	}
	@Override
	@Transactional(readOnly=false)
	public void updateStudent(Student std) {
		
		try {
			entityManager.merge(std);
			System.out.println("Student data Updated successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error while updating Student Data");
		}
		
	}
	@Override
	@Transactional(readOnly=false)
	public void deleteStudent(int id) {
		try {
			Query query=entityManager.createQuery("Delete from Student s where s.rollno=:rollNo");
			query.setParameter("rollNo", id);
			int count = query.executeUpdate();
			System.out.println("Data deleted successfully, "+count+" rows affected");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error while deleting Student data");
		}
		
	}

}
