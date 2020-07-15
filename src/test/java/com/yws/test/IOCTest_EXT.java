package com.yws.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.ext.MyConfigExt;

public class IOCTest_EXT {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigExt.class);

		context.publishEvent(new ApplicationEvent(new String("我发布了事件")) {
		});
		
		context.close();
	}
}
