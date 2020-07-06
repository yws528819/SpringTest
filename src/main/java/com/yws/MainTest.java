package com.yws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yws.bean.Person;
import com.yws.config.MyConfig;

public class MainTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		Person person = applicationContext.getBean(Person.class);
//		System.out.println(person);
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
		
		String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
		for (String name : namesForType) {
			System.out.println(name);
		}
	}
}
