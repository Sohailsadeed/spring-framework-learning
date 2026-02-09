package com.practice.main;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MainFour {
	public static void main(String[] fs) {
		int num1=12345656;
		double num2=123.675590;
		Locale locale=Locale.getDefault();
		Currency cur=Currency.getInstance(locale);
		
		Locale locale2=new Locale("fr","FR");
		Currency curr=Currency.getInstance(locale2);
		
		System.out.println(cur.getSymbol()+": "+cur.getDisplayName());
		System.out.println(curr.getSymbol()+": "+curr.getDisplayName());
		
		System.out.println("------------Currency for USA-----------");
		Locale locale3=new Locale("","US");
		NumberFormat numFor=NumberFormat.getCurrencyInstance(locale3);
		System.out.println(numFor.format(num1));
		System.out.println(numFor.format(num2));
		
		System.out.println("------------Currency for UK-------------");
		NumberFormat numFor2=NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(numFor2.format(num1));
		System.out.println(numFor2.format(num2));
		
		
	}
}
