package com.practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.practice.beans.Student;
import com.practice.conn.ConnectionSetter;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status=false;
		
		try {
			Connection con=ConnectionSetter.createConnection();
			PreparedStatement ps= con.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, std.getRollno());
			ps.setString(2, std.getName());
			ps.setInt(3, std.getMarks());
			
			int count = ps.executeUpdate();
			
			ps.close();
			con.close();
			
			if(count>0)
				status=true;
			else
				status=false;
		} catch (SQLException e) {
			status=false;
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Student getStudentDetails(int id) {
		
		Student std=null;
		try {
			Connection con=ConnectionSetter.createConnection();
			PreparedStatement ps=con.prepareStatement("select * from student where id=?");
			ps.setInt(1, id);
			
			ResultSet rs= ps.executeQuery();
			
			ps.close();
			con.close();
			
			std=new Student();
			if(rs.next()) {
			std.setRollno(rs.getInt(1));
			std.setName(rs.getString(2));
			std.setMarks(rs.getInt(3));
			return std;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return std;
	}
}
