package com.practice.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankingAspects {
//	@Before("execution(* com.practice.services.BankTransaction.*(..)) || " +
//			"execution(* com.practice.services.AtmServices.*(..))")
//	public void myLoginBefore() {
//		System.out.println("\nLogin aspect called (before) business logic");
//	}
//	@After("execution(* com.practice.services.BankTransaction.*(..)) || " +
//			"execution(* com.practice.services.AtmServices.*(..))")
//	public void myLoginAfter() {
//		System.out.println("Login aspect called (after) business logic");
//	}
	
	@Around("execution(* com.practice.services.BankTransaction.*(..))")
	public Object myLoginAfter(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("Aspect Before business method");

        Object result = joinPoint.proceed();

        System.out.println("Aspect After business method\n");

        return result;
	}
	
}
