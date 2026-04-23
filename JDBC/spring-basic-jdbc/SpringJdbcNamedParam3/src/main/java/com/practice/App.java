package com.practice;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.practice.beans.Items;
import com.practice.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	NamedParameterJdbcTemplate template=context.getBean("templateId",NamedParameterJdbcTemplate.class);
    	Items item=context.getBean("itemId",Items.class);
    	BeanPropertySqlParameterSource paramSource=new BeanPropertySqlParameterSource(item);
    	
    	String sqlQuery="insert into items values(:itemId, :itemName, :itemPrice)";//parameter name shall be same as property name in the Bean class
    	int count=template.update(sqlQuery, paramSource);
    	if(count>0) {
    		System.out.println("Insert Successful");
    	}
    	else{
    		System.out.println("Insert Failed");
    	}
    	
    }
} 
