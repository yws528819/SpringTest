package com.yws.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.bean.Person;
import com.yws.config.MyConfigOfLifeCircle;
import com.yws.config.MyConfigOfPropertyValue;

public class IOCTest_PropertyValue {
	
	//创建IOC容器
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfPropertyValue.class);

	@SuppressWarnings("resource")
	@Test
	public void test() {
		printBeanDefineNames(context);
		
		System.out.println("=============");
		
		String nickName = context.getEnvironment().getProperty("person.nickName");
		System.out.println(nickName);
		
		
		Person person = context.getBean(Person.class);
		System.out.println(person);
		


	}
	
	void printBeanDefineNames(ApplicationContext context) {
		String[] definitionNames = context.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
	}
}
