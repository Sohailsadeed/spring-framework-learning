package com.practice.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class Main1 {
	public static void main(String[] hs) {
		
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		dataSource.setUser("root");
		dataSource.setPassword("7867");
		try(
				Connection con= dataSource.getConnection();
				PreparedStatement ps=con.prepareStatement("insert into student value(?,?,?)");
			)
		{
			ps.setInt(1, 1);
			ps.setString(2, "Darling");
			ps.setInt(3, 100);
			
			int count=ps.executeUpdate();
			if(count>0) {
				System.out.println("Insert Successful");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
