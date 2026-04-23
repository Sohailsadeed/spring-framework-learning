package com.practice.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.practice.bean.Student;

public class StudentDaoImpl implements StudentDao{
	
	private NamedParameterJdbcTemplate template;
	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	@Override
	public boolean addStudentDetails(Student std) {
		Boolean status=false;
		
		BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(std);
		
		String sqlQuery="insert into student values(:rollno,:name,:marks)";
		
		try{
		
		int count= template.update(sqlQuery, source);
		if(count>0)
			status=true;
		else 
			status=false;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
