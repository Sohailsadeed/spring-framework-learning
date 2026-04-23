package com.practice.dao;

import com.practice.beans.Student;

public interface StudentDao {
	public Student getStudent(int id);
	public void insertStudent(Student std);
	public void updateStudent(Student std);
	public void deleteStudent(int id);
}
