package com.practice.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {
	
	@GetMapping("/aaa")
	public String serveRequest() {
		System.out.println(10/0);
		return "hello";
	}
	
	@GetMapping("/arithmeticError")
	public String treatError() {
		return "errorpage";
	}
}
