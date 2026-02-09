package com.practice.main;

import java.util.Locale;

public class Main {
	public static void main(String[] r5sd) {
		Locale locale=Locale.getDefault();
		System.out.println("Default Locale: "+locale);
		System.out.println("Country code: "+locale.getCountry());
		System.out.println("Name of country: "+locale.getDisplayCountry());
		System.out.println("Name of Language: "+locale.getDisplayLanguage());
		System.out.println("Language code: "+locale.getLanguage());
		
		System.out.println("-------------------------------------");
		
		Locale locale2= new Locale("fr","FR");
		System.out.println("CustomLocale: "+locale2);
		System.out.println("Country code: "+locale2.getCountry());
		System.out.println("Name of country: "+locale2.getDisplayCountry());
		System.out.println("Name of Language: "+locale2.getDisplayLanguage());
		System.out.println("Language code: "+locale2.getLanguage());
	
		
	}
}
