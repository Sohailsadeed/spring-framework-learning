package com.practice.resources;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.practice.dao.StudentDao;
import com.practice.dao.StudentDaoImpl;

@Configuration
@EnableTransactionManagement//for <tx:annotation-driven/>
public class SpringConfigFile {
	
	@Bean("dmDataSource")
	public DriverManagerDataSource createDmDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate_db");
		dataSource.setUsername("root");
		dataSource.setPassword("7867");
		return dataSource;
	}
	@Bean("factory")
	public LocalSessionFactoryBean createSessionFactory() {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
	
		sessionFactory.setDataSource(createDmDataSource());
		sessionFactory.setHibernateProperties(hibernateProperties);
		sessionFactory.setMappingResources("/com/practice/resources/student.cfg.xml");
		return sessionFactory;
	}
	
	@Bean("transactionManager")
	public HibernateTransactionManager createTransaction() {
		HibernateTransactionManager transManager=new HibernateTransactionManager();
		transManager.setSessionFactory(createSessionFactory().getObject());
		return transManager;
	}
	
	@Bean
	public StudentDao createDao() {
		StudentDaoImpl studentDao=new StudentDaoImpl();
		studentDao.setSessionFactory(createSessionFactory().getObject());
		return studentDao;
	}
}
