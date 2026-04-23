package com.practice.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.practice.ServiceDao.StudentService;
import com.practice.ServiceDao.StudentServiceImpl;
import com.practice.dao.StudentDao;
import com.practice.dao.StudentDaoImpl;
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
		config.setMaximumPoolSize(10);
		config.setMinimumIdle(2);
		
		HikariDataSource dataSource = new HikariDataSource(config);
		
		return dataSource;
	}
	
	@Bean
	public NamedParameterJdbcTemplate createTemplate() {
		NamedParameterJdbcTemplate template=new NamedParameterJdbcTemplate(createDataSource());
		return template;
	}
		
	@Bean
	public StudentDao createStudentDao() {
		
		StudentDaoImpl impl=new StudentDaoImpl();
		impl.setTemplate(createTemplate());
		return impl;
	}
	
	@Bean
	public StudentService createService() {
		
		StudentServiceImpl impl=new StudentServiceImpl();
		impl.setStdDao(createStudentDao());
		
		return impl;
	}
}





