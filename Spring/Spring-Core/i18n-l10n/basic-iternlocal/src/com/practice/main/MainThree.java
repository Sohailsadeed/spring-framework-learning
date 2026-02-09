package com.practice.main;

import java.text.NumberFormat;
import java.util.Locale;

public class MainThree {
	public static void main(String[] du) {
		int num1=12345656;
		double num2=123.675590;
		Locale locale=Locale.getDefault();
		
		NumberFormat numberFormat=NumberFormat.getInstance(locale);
		System.out.println("------------------------");
		System.out.println(numberFormat.format(num1));
		System.out.println(numberFormat.format(num2));
		
		Locale locale2=new Locale("fr","FR");
		NumberFormat nuFor=NumberFormat.getInstance(locale2);
		System.out.println("------------------------");
		System.out.println(nuFor.format(num1));
		System.out.println(nuFor.format(num2));
		
	}
}
