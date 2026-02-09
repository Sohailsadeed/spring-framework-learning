package com.wizard.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.aspects.AtmServices;
import com.praxtice.serives.BankService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("/com/practice/resources/applicationContext.xml");
    	
    	BankService service= context.getBean("BankTransId",BankService.class);
    	
    	service.initiateUpiTransaction();
    	
    	service.initiateWalletTransaction()
    	
    	
    	;
    	
    	AtmServices services= context.getBean("AtmServId",AtmServices.class);
    	
    	services.initiateCardLessTransaction();
    	
    	services.initiatePinTransaction();
    }
}
