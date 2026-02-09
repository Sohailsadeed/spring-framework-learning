package com.practice.configurations;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		webAppContext.register(WebConfig.class);
		webAppContext.setServletContext(servletContext);
		
		ServletRegistration.Dynamic servlet= servletContext.addServlet("dispatcher", new DispatcherServlet(webAppContext));
		servlet.addMapping("/");
	}
		
}
