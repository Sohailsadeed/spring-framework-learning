package com.practice;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.beans.Items;
import com.practice.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	Items item1=new Items();
    	item1.setItemId(331);
    	item1.setItemName("Mouse pad");
    	item1.setItemPrice(499);
    	
    	Items item2=new Items();
    	item2.setItemId(3321);
    	item2.setItemName("Cooling Fans");
    	item2.setItemPrice(9999);
    	
    	List<Items> itemList=new ArrayList<Items>();
    	itemList.add(item1);
    	itemList.add(item2);
    	
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	JdbcTemplate template=context.getBean("templateId",JdbcTemplate.class);
    	
    	String sqlQuery="insert into items values(?,?,?)";
    	int count[] =template.batchUpdate(sqlQuery, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Items item= itemList.get(i);
				
				ps.setInt(1, item.getItemId());
				ps.setString(2, item.getItemName());
				ps.setInt(3, item.getItemPrice());
				
			}
			@Override
			public int getBatchSize() {
				return itemList.size();
			}
		});
    }
}
