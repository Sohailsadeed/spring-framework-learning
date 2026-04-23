package com.practice.main;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

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
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        DataSource dataSource= context.getBean(DataSource.class);
        
        JdbcTemplate template= context.getBean(JdbcTemplate.class);
        Items item1=new Items();
        item1.setItemId(11);
        item1.setItemName("KeyPad");
        item1.setItemPrice(299);
        
        Items item2=new Items();
        item2.setItemId(12);
        item2.setItemName("TouchPad");
        item2.setItemPrice(899);
        
        List<Items> itemList=new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        
        String sqlQuery="insert into items values(?,?,?)";
        int[] count=template.batchUpdate(sqlQuery, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				
				Items item=itemList.get(i);
				ps.setInt(1, item.getItemId());
				ps.setString(2, item.getItemName());
				ps.setInt(3, item.getItemPrice());
				
			}
			
			@Override
			public int getBatchSize() {
				
				return itemList.size();
			}
		});
        for(int i:count) {
        	System.out.println(i+": Success");
        }
    }
}
