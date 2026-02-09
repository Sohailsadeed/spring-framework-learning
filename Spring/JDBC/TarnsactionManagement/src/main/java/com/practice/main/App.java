package com.practice.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
    	Connection con=null;
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jdbc","root","7867");
		Statement st=con.createStatement();
		
		con.setAutoCommit(false);
		
		int count1=st.executeUpdate("insert into student values(1,'Wizard',87)");
		int count2 = st.executeUpdate("insert into student values(2,'Spparke',99)");
		
		if(count1>0 && count2>0) {
			con.commit();
			System.out.println("Success");
		}
		else {
			con.rollback();
			System.out.println("Failure");
		}
    }
    	catch(Exception e) {
    		try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
    		e.printStackTrace();
    	}
     }
   }
