package com.practice.main;

import java.sql.Connection;
import java.sql.DriverManager;
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
			Statement st=con.createStatement();
			
			st.addBatch("insert into items values(338,'Dongle',2499)");
			st.addBatch("insert into items values(339,'Hdmi',1499)");
			st.addBatch("insert into items values(340,'OLED',1299)");
			
			int[] count=st.executeBatch();
			for(int i:count) {
				System.out.println(i+" Successs");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
