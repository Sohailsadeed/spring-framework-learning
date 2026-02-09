package com.practice;


import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.beans.Items;
import com.practice.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	JdbcTemplate template=context.getBean("templateId",JdbcTemplate.class);
    	
    	Items item=context.getBean("itemId",Items.class);
    	String sqlQuery="insert into items values(?,?,?)";
//    	int count=template.update(sqlQuery,itemId,itemName,itemPrice);
//    	if(count>0) {
//    		System.out.println("Sucessful insert");
//    	}
//    	else {
//    		System.out.println("Insert Failed");
//    	}
    	
    	
    	int count=template.update(sqlQuery, item.getItemId(), item.getItemName(), item.getItemPrice() );
    	if(count>0) {
    		System.out.println("Insert Successful");
    	}
    	else {
    		System.out.println("Inser Failed");
    	}
    	 
    }
}
