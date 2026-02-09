package com.practice.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


class Demo{
	public Demo(String name){
		System.out.println("Hello "+name+",  Welcom to SpEL");
	}
}
public class Main4 {
	public static void main(String[] diuf) {
		ExpressionParser parser= new SpelExpressionParser();
		
//		Expression expression = parser.parseExpression("T(Math).PI");
//		
//		System.out.println(expression.getValue());
//		
//		Expression exp=parser.parseExpression("new com.practice.main.Demo(\"Wizard\")");
//		exp.getValue();
//	
		Expression expr=parser.parseExpression("T(com.practice.main.MyClass).m2()");//static method called manually
		expr.getValue();
		
		Expression ex=parser.parseExpression("new com.practice.main.MyClass().m1()");//instance method called by creating an object
		ex.getValue();
	}
}
 