package com.practice.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {
	
//	@RequestMapping("/getName")
//	public String generateName(HttpServletRequest req, HttpServletResponse resp, Model model) {
//		
//		String name= req.getParameter("name1");
//		model.addAttribute("model_name",name);
//		return "hello";
//		
//	}
	
//	@RequestMapping("/getName")
//	public String generateName(
//										@RequestParam String name1,
//										@RequestParam String city1,
//										@RequestParam String email1,
//										Model model) {
//		
//		model.addAttribute("name", name1);
//		model.addAttribute("city", city1);
//		model.addAttribute("email", email1);
//		
//		return "hello";
//	}
	
//	@RequestMapping("/getName")
//	public ModelAndView generateName(HttpServletRequest req, HttpServletResponse resp) {
//		String name=req.getParameter("name1");
//		
//		ModelAndView mav= new ModelAndView();
//		mav.addObject("mav_name",name);
//		mav.setViewName("hello");
//		
//		return mav;
//	}
	
//	@RequestMapping("/getName")
//	public ModelAndView generateName(HttpServletRequest req, HttpServletResponse resp) {
//		Map<String,String> details =new HashMap<>();
//		details.put("name", req.getParameter("name1"));
//		details.put("email", req.getParameter("email1"));
//		details.put("city", req.getParameter("city1"));
//		
//		ModelAndView mav= new ModelAndView();
//		mav.addObject("details",details);
//		mav.setViewName("hello");
//		
//		return mav;
//	}
	@RequestMapping("/getName")
	public ModelAndView generateName(HttpServletRequest req, HttpServletResponse resp) {
		Map<String,String> details =new HashMap<>();
		details.put("name", req.getParameter("name1"));
		details.put("email", req.getParameter("email1"));
		details.put("city", req.getParameter("city1"));
		
		ModelAndView mav= new ModelAndView("hello","details",details);
		
		return mav;
	}
}
