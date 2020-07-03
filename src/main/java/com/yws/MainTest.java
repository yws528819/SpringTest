package com.yws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yws.bean.Person;

public class MainTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
