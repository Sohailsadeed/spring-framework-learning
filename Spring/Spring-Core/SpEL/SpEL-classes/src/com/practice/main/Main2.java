package com.practice.main;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main2 {
	public static void main(String[] hfu) {
		
		ExpressionParser parser= new SpelExpressionParser();
		
		EvaluationContext context= new StandardEvaluationContext();
		context.setVariable("no1", 786);
		context.setVariable("no2", 196);
		
		Expression expression = parser.parseExpression(" (#no1 + #no2)");
		
		Object obj= expression.getValue(context);
		System.out.println(obj);
	}
}
