package com.java8.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware{
	
	private ApplicationContext applicationContext;

	public ApplicationContextProvider() {
		System.out.println("Application Context constructor called ...");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("::: Setting the bean ::: ["+this.applicationContext+"]");
		
	}
	
	public ApplicationContext getApplicationContext() {
		return this.applicationContext;
	}
	

}
