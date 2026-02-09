package com.practice.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class SecurityAspects {
	
	@Before("execution(* com.practice.services.BankTransaction.*(..)) || " + "execution(* com.practice.services.AtmServices.*(..))")
	public void provideSecurity() {
		System.out.println("\n-------Securing the Transaction-------");
	}
}
