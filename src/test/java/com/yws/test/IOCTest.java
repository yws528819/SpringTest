package com.yws.test;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.bean.Person;
import com.yws.config.MyConfig;
import com.yws.config.MyConfig2;

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
	
	@Test
	public void test02() {
		 ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
		 
		 Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
		 System.out.println(beansOfType);
		 
		 System.out.println("---------------");
		 
		 String[] namesForType = context.getBeanNamesForType(Person.class);
		 for (String name : namesForType) {
			 System.out.println(name);
		 }
		 
	}
	
	
	@Test
	public void testImport() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
		print(context);
		Object bean1 = context.getBean("colorFactoryBean");
		Object bean2 = context.getBean("colorFactoryBean");
		
		System.out.println(bean1 == bean2);
		
		System.out.println(context.getBean("&colorFactoryBean"));

	}
	
	void print(ApplicationContext context) {
		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
