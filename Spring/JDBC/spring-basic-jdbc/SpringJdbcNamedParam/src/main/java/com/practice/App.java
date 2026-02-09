package com.practice;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.practice.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	Map<String,Object> map= new HashMap<String,Object>();
    	map.put("itemId", 114);
    	map.put("itemName","JoyStick");
    	map.put("itemPrice", 12999);
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	NamedParameterJdbcTemplate template=context.getBean("templateId",NamedParameterJdbcTemplate.class);
    	
    	String sqlQuery="insert into items values(:itemId, :itemName, :itemPrice)";
    	int count=template.update(sqlQuery, map);
    	if(count>0) {
    		System.out.println("Insert Successful");
    	}
    	else{
    		System.out.println("Insert Failed");
    	}
    	
    }
} 
	