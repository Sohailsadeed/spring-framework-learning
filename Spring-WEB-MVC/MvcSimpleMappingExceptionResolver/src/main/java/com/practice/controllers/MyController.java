package com.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/aaa")
	public String serveRequest() {
		String name=null;
//		System.out.println(name.length());
		System.out.println(10/0);
		return "hello";
	}
}
