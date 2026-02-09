package com.practice;


import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	int itemId=113;
    	String itemName="PS-5";
    	int itemPrice=31999;
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	JdbcTemplate template=context.getBean("templateId",JdbcTemplate.class);
  
    	
    	String sqlQuery="update items set item_price=? where  item_id=?";
    	int count=template.update(sqlQuery, new Object[] { itemPrice, itemId});
    	if(count>0) {
    		System.out.println("Update Successful");
    	}
    	else{
    		System.out.println("Update Failed");
    	}
    	
    }
} 
