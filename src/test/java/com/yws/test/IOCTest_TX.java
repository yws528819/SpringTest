package com.yws.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.tx.MyConfigOfTX;
import com.yws.tx.UserService;

public class IOCTest_TX {
	
	@SuppressWarnings("resource")
	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfTX.class);
		
		UserService userService = context.getBean(UserService.class);
		userService.insert();
	}
	
}
