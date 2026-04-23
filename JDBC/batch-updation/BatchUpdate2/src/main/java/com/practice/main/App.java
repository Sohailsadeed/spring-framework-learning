package com.practice.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jdbc","root","7867");
			PreparedStatement ps=con.prepareStatement("insert into items values(?,?,?)");
			
			ps.setInt(1,341);
			ps.setString(2, "IEMs");
			ps.setInt(3, 2899);
			ps.addBatch();
			
			ps.setInt(1, 342);
			ps.setString(2, "Ear Buds");
			ps.setInt(3, 2499);
			ps.addBatch();
			
			int count[]= ps.executeBatch();
			for(int i:count) {
				System.out.println(i+" Successs");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
