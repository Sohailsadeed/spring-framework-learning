package com.practice.dao;

import com.practice.beans.Student;

public interface StudentDao {
	public void addStudent(Student std);
	public void updateStudent(Student std);
	public Student getStudent(int id);
	public void deleteStudent(Student std);
}
