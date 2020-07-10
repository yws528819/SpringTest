package com.yws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.yws.dao.BookDao;

@ComponentScan(basePackages = {"com.yws.controller", "com.yws.service","com.yws.dao"})
@Configuration
public class MyConfngOfDependencyInject {

	@Primary
	@Bean("bookDao2")
	public BookDao bookDao() {
		 BookDao bookDao = new BookDao();
		 bookDao.setLabel("2");
		 return bookDao;
	}
}
