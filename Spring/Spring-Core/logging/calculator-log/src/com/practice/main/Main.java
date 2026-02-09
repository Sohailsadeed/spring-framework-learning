package com.practice.main;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
	public static void main(String[] args) throws SecurityException, IOException 
	{
		FileHandler fileHandler=new FileHandler("D:\\calc.log",true);
		SimpleFormatter simpleFormatter=new SimpleFormatter();
		fileHandler.setFormatter(simpleFormatter);
		
		Logger logger=Logger.getLogger("Test");
		logger.addHandler(fileHandler);
		
//		logger.setLevel(Level.WARNING);
		logger.log(Level.INFO, "User started the application");
//		System.out.println("Welcome to the calculator\n=======================================");
		int n,m;
		char choice;
		do {
			
		logger.log(Level.SEVERE,"==============================================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER 1: ");
		n=sc.nextInt();
		logger.log(Level.INFO,"USER INPUT NUMBER 1: "+n);
		System.out.println("ENTER NUMBER 2: ");
		m=sc.nextInt();
		logger.log(Level.INFO,"USER INPUT NUMBER 2: "+m);
		System.out.println("ENTER YOUR CHOICE: (+, -, *, /)");
		char c=sc.next().charAt(0);
		
		switch(c) {
		case '+':
			logger.log(Level.INFO,"USER CHOSE +");
			System.out.println("The sum is"+(n+m));
			logger.log(Level.INFO,"sum is "+(n+m));
			break;
		case '-':
			logger.log(Level.INFO,"USER CHOSE -");
			System.out.println("The difference is"+(n-m));
			logger.log(Level.INFO,"difference is "+(n-m));
			break;
		case '*':
			logger.log(Level.INFO,"USER CHOSE *");
			System.out.println("The product is"+n*m);
			logger.log(Level.INFO,"product is "+n*m);
			break;
		case '/':
			if(m==0) {
				logger.log(Level.WARNING,"Cannot divide by zero");
				System.out.println("Cannot divide by zero");
				break;
			}
			logger.log(Level.INFO,"USER CHOSE /");
			System.out.println("The quotient is"+n/m);
			logger.log(Level.INFO,"difference is "+n/m);
			break;
		default:
			logger.log(Level.INFO,"Not a valid operation");
			System.out.println("Not a valid operation");
			break;
		}
		System.out.println("Would you like to continue? press y to continue else press any key to exit");
		choice=sc.next().charAt(0);
	}while(choice=='y'|| choice=='Y');
		
			
	}
}
