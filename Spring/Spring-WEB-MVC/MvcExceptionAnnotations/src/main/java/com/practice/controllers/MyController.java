package com.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@GetMapping("/aaa")
	public String serveRequest() {
		System.out.println(10/0);
		return "hello";
	}
	
//	@ExceptionHandler(NullPointerException.class)
	@ExceptionHandler(ArithmeticException.class)
	public String errorPage() {
		return "errorpage";
	}	
}
