package com.yws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yws.bean.Person;
import com.yws.dao.BookDao;

@Configuration
//@ComponentScan(value = "com.yws", excludeFilters = {
//		@Filter(type = FilterType.ANNOTATION, classes = {
//				Controller.class,Service.class
//		})
//})

//@ComponentScan(value = "com.yws", includeFilters = {
//		@Filter(type = FilterType.ANNOTATION, classes = {
//				Controller.class,Service.class
//		})
//}, useDefaultFilters = false)

//ComponentScan value:指定要扫描的包
//excludeFilters = Filter[], 指定扫描的时候按照什么规则排除哪些组件
//includeFilters = Filter[], 指定扫描的时候只需包含哪些组件
//		FilterType.ANNOTATION 按照注解
//		FilterType.ASSIGNABLE_TYPE 按照给定的类型
//		FilterType.ASPECTJ 使用ASPECTJ表达式
//		FilterType.REGEX 使用正则表达式
//		FilterType.CUSTOM 使用自定义规则
@ComponentScans(value = {
		@ComponentScan(value = "com.yws", includeFilters = {
//				@Filter(type = FilterType.ANNOTATION, classes = {
//						Controller.class,Service.class
//				}),
//				@Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
//						BookDao.class
//				})
				
				@Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
				
				
		}, useDefaultFilters = false)
		
})		
public class MyConfig {

	@Bean
	public Person person() {
		return new Person();
	}
}
