package com.yws.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.bean.Boss;
import com.yws.bean.Car;
import com.yws.bean.Color;
import com.yws.config.MyConfigOfAutowired;

public class IOCTest_Autowired {

	@SuppressWarnings("resource")
	@Test
	public void Test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfAutowired.class);
		Boss boss = context.getBean(Boss.class);
		
		System.out.println(boss);
		System.out.println(context.getBean(Car.class));
		
		System.out.println(context.getBean(Color.class));
		
		context.close();
	}
}
