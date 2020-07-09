package com.yws.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class Dog {
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
}
