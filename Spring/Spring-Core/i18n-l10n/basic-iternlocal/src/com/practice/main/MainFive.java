package com.practice.main;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class MainFive {
	public static void main(String[] gydu) {
		
		Date date=new Date();
		System.out.println(date+"\n");
		
		System.out.println("-------------Date as per INDIA------------");
		
		Locale locale=new Locale("en","IN");
		DateFormat df=DateFormat.getDateInstance(0, locale);
		System.out.println(df.format(date)+"\n");
		
		System.out.println("-------------Date as per US---------------");
		DateFormat df1=DateFormat.getDateInstance(0, new Locale("en","US"));
		System.out.println(df1.format(date));
		
	}
}
