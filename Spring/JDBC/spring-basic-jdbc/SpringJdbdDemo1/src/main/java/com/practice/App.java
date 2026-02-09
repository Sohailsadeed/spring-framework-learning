package com.practice;


import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App 
{
    public static void main( String[] args )
    {
//    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
//    	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//    	dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
//    	 dataSource.setUsername("roo t");
//    	 dataSource.setPassword("7867");
    	 
//    	JdbcTemplate template=new JdbcTemplate();
//    	template.setDataSource(dataSource);
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("/com/practice/resources/applicationContext.xml");
    	JdbcTemplate template=context.getBean("templateId",JdbcTemplate.class);
    }
}
