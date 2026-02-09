package com.practice.ServiceDao;

import com.practice.bean.Student;
import com.practice.dao.StudentDao;

public class StudentServiceImpl implements StudentService{

	private StudentDao stdDao;
	public void setStdDao(StudentDao stdDao) {
		this.stdDao = stdDao;
	}
	public boolean addStdDetailsService(Student std) {
		return stdDao.addStudentDetails(std);
	}

}
