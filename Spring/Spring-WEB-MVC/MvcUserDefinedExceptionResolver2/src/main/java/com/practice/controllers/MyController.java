package com.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.exceptions.LessAgeException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {
	
	@PostMapping("/aaa")
	public String serveRequest(HttpServletRequest req) {
		String agestr=req.getParameter("age");
		String page;
		int age=Integer.parseInt(agestr);
		
		if(age<18)
			throw new LessAgeException("Sorry, you cannot vote as you are a minor");	
		else
			page="success";
		
		return page;
	}
	@PostMapping("/errorpage")
	public 	String openErrorPage() {
		return "errorpage";
	}
}
