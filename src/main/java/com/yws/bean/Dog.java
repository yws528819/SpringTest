package com.yws.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class Dog implements ApplicationContextAware{
	
	private ApplicationContext context;
	
	
	public Dog() {
		System.out.println("Dog construct...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("dog init ...atfer setProperties");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("dog destroy ...");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		
	}
}
