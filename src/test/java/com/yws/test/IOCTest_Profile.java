package com.yws.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.bean.Dog;
import com.yws.config.MyConfigOfProfile;
import com.yws.dao.BookDao;

public class IOCTest_Profile {

	@SuppressWarnings("resource")
	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfProfile.class);
		
		String[] names = context.getBeanNamesForType(DataSource.class);
		for(String name : names) {
			System.out.println(name);
		}
		
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test2() {
		//1.创建一个无参applicationContext
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//2.设置需要激活的环境
		context.getEnvironment().setActiveProfiles("test","dev");
		//3.注册主配置类
		context.register(MyConfigOfProfile.class);
		//4.启动刷新容器
		context.refresh();
		
		
		String[] names = context.getBeanNamesForType(DataSource.class);
		for(String name : names) {
			System.out.println(name);
		}

	}
	
	
	@SuppressWarnings("resource")
	@Test
	public void test3() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfProfile.class);

		BookDao bookDao = context.getBean(BookDao.class);
		bookDao.query();
		
	}
}
