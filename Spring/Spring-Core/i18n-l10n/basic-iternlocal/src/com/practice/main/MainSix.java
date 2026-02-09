package com.practice.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainSix {
	public static void main(String[] ugyf) {
		Date date=new Date();
		
//		String pattern="dd/MM/yyyy";
//		String pattern="dd/MMM/yyyy";
//		String pattern="dd-MMM-yy";
//		String pattern="dd MM yyyy";
//		String pattern="dd/MMM/yyyy hh:mm:ss:aa";
		String pattern="dd/MMM/yyyy HH:mm:ss";
		SimpleDateFormat df= new SimpleDateFormat(pattern);
		System.out.println(df.format(date));
	}
}
