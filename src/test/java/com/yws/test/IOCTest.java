package com.yws.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.config.MyConfig;

@SuppressWarnings("resource")
public class IOCTest {
	@Test
	public void test01() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		
		for (String bean : beanDefinitionNames) {
			System.out.println(bean);
		}
		
	}
}
