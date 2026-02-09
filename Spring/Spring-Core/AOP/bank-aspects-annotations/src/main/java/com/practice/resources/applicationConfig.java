package com.practice.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.practice.aspects.BankingAspects;
import com.practice.aspects.SecurityAspects;
import com.practice.services.AtmServices;
import com.practice.services.BankTransaction;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.practice")
public class applicationConfig {
	

}
