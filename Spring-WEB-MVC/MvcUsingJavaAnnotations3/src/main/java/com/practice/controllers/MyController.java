package com.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/demo")
	public ModelAndView getModelAndView() {
		ModelAndView mav= new ModelAndView("hello");
		return mav;
	}
}
