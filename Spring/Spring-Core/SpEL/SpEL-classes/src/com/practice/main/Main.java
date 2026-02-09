package com.practice.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String[] kjsdv) {
		ExpressionParser parser=new SpelExpressionParser();
		Expression expression=parser.parseExpression("      'Hello wizard'  	");
		Object obj=expression.getValue();
		System.out.println(obj);
		
		Expression exp=parser.parseExpression("10+20");
		int res=exp.getValue(Integer.class);
		System.out.println(res);
	}
}
	