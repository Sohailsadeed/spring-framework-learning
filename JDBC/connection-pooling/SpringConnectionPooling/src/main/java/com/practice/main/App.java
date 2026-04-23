package com.practice.main;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        DataSource dataSource= context.getBean(DataSource.class);
        
        try {
			Connection con=dataSource.getConnection();
			Connection con2=dataSource.getConnection();
			Connection con3=dataSource.getConnection();
			Connection con4=dataSource.getConnection();
			Connection con5=dataSource.getConnection();
			con.close();
			Connection con6=dataSource.getConnection();
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
