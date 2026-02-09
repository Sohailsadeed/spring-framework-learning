package com.practice.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
	public static void main(String[] iudf) {
		
		Locale locale=new Locale("ur","PK");
		
		ResourceBundle resourceBundle=ResourceBundle.getBundle("com.practice.resources.MessageBundle", locale);
		String msg=resourceBundle.getString("key_greet");
		System.out.println(msg);
	}
}
