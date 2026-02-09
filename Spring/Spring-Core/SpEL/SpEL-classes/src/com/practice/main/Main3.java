package com.practice.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main3 {
	public static void main(String[] liuf) {
		ExpressionParser parser= new SpelExpressionParser();
		
//		Expression expression = parser.parseExpression("10 eq 20");
//		boolean b=expression.getValue(Boolean.class);
//		System.out.println(b);
		
//		Expression expression =parser.parseExpression("10 ne 20");
//		System.out.println(expression.getValue());
		
//		Expression expression = parser.parseExpression("(10 lt 20) and (40 gt 30)");
//		System.out.println(expression.getValue());
		
		Expression expression = parser.parseExpression("80 ne 20 ? 'Yes' : 'No' ");
		System.out.println(expression.getValue());
	}
}
