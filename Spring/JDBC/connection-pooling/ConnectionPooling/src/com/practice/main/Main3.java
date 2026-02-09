package com.practice.main;

import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Main3 {
	public static void main(String[] args) {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		config.setUsername("root");
		config.setPassword("7867");
		config.setMaximumPoolSize(10);
		HikariDataSource dataSource = new HikariDataSource(config);

		try (Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
			)
		{
			//JMX allows monitoring and managing JVM resources at runtime
			//Hikari exposes its pool statistics via MXBeans
			//PlatformBeanServer is the central registry for MBeans in the JVM 
			MBeanServer mBeanServer= ManagementFactory.getPlatformMBeanServer();
			
			//Vendor->com.zaxxer.hikari, component->Pool, Poolname
			ObjectName poolObjectName=new ObjectName("com.zaxxer.hikari:type=Pool("+dataSource.getPoolName()+")");
			
			//getHikariPoolMXBean()--> exposes active, idle and total connections
			mBeanServer.registerMBean(dataSource.getHikariPoolMXBean(), poolObjectName);
			
			int active=(int) mBeanServer.getAttribute(poolObjectName, "ActiveConnections");
			int idle=(int) mBeanServer.getAttribute(poolObjectName, "IdleConnections");
			int total=active+idle;
			
			System.out.println("Total connections: "+total);
			System.out.println("Active connections: "+active);
			System.out.println("Idle connections: "+idle);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
