package com.practice.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class SpringConfigFile {
	@Bean
	public DataSource createDataSource() {
		
		HikariConfig config=new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		config.setUsername("root");
		config.setPassword("7867");
		config.setMaximumPoolSize(5);
		
		HikariDataSource dataSource=new HikariDataSource(config);
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate createTemplate() {
		JdbcTemplate template=new JdbcTemplate(createDataSource());
		return template;
	}
}
