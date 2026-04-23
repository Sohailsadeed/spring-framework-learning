package com.practice.conn;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionSetter {
	static Connection con=null;
	public static Connection createConnection() throws SQLException {
		
		HikariConfig config=new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		config.setUsername("root");
		config.setPassword("7867");
		config.setMaximumPoolSize(10);
		config.setMinimumIdle(2);
		DataSource dataSource = new HikariDataSource(config);
		
		con=dataSource.getConnection();
	
		return con;
	}
}
