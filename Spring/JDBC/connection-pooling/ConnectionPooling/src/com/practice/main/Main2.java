package com.practice.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Main2 {
	public static void main(String[] args) {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		config.setUsername("root");
		config.setPassword("7867");
		config.setMaximumPoolSize(10);
		HikariDataSource dataSource = new HikariDataSource(config);

		try (Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
			)
		{
			ps.setInt(1, 101);
			ps.setString(2, "Sohail");
			ps.setInt(3, 92);

			int count = ps.executeUpdate();

			if (count > 0) {
				System.out.println("Insert Successsful");
			} else {
				System.out.println("Insert Failed");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
