package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.resources.applicationConfig;
import com.practice.services.AtmServices;
import com.practice.services.BankTransaction;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(applicationConfig.class);
        
        BankTransaction bank= context.getBean(BankTransaction.class);
        bank.initiateUpiTrans();
        bank.initiateWalletTrans();
        
        AtmServices atm=context.getBean(AtmServices.class);
        atm.initiateCardLessTransaction();
    }
}
