package com.practice.dao;

import com.practice.beans.Student;

public interface StudentDao {
	public boolean addStudentDetails(Student std);
	public Student getStudentDetails(int id);
}
