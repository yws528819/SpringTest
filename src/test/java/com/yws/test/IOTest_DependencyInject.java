package com.yws.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yws.config.MyConfngOfDependencyInject;
import com.yws.dao.BookDao;
import com.yws.service.BookService;

public class IOTest_DependencyInject {

	@SuppressWarnings("resource")
	@Test
	public void test01() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfngOfDependencyInject.class);
		BookService bookService = context.getBean(BookService.class);
		System.out.println(bookService);
		
//		Object bookDao2 = context.getBean(BookDao.class);
//		System.out.println(bookDao2);
		
	}
}
