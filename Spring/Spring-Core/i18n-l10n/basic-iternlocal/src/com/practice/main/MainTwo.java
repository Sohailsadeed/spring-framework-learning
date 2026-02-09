package com.practice.main;

import java.util.Locale;

public class MainTwo {
	public static void main(String[] siusf) {
		
		Locale mylocale = Locale.TAIWAN;
		String[] languageCodes=Locale.getISOLanguages();
		for (String language: languageCodes) {
			Locale l=new Locale(language);
			System.out.println(l.getLanguage()+"-->"+l.getDisplayLanguage()+" - "+l.getDisplayLanguage(mylocale));
		}
		
//		Locale yourlocale = new Locale("te");
//		String[] countryCodes=Locale.getISOCountries();
//		for (String countryCode : countryCodes) {
//			Locale l=new Locale("",countryCode);
//			System.out.println(countryCode+"---->"+l.getDisplayCountry()+" - "+l.getDisplayCountry(yourlocale));
//		}
	}
}
