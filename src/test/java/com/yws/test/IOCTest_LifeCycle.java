package com.yws.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.config.MyConfigOfLifeCircle;

public class IOCTest_LifeCycle {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		//1.创建IOC容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfLifeCircle.class);
		
		System.out.println("容器创建完成。。。");
		
		//关闭容器
		context.close();
	}
}
