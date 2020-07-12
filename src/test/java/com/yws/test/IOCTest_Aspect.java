package com.yws.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.bean.MathCaculator;
import com.yws.config.MyConfigOfAop;

public class IOCTest_Aspect {

	@SuppressWarnings("resource")
	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfAop.class);
		
		MathCaculator mathCaculator = context.getBean(MathCaculator.class);
		
		mathCaculator.div(10, 5);
		
	}
}
