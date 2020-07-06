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

//ComponentScan value:ָ��Ҫɨ��İ�
//excludeFilters = Filter[], ָ��ɨ���ʱ����ʲô�����ų���Щ���
//includeFilters = Filter[], ָ��ɨ���ʱ��ֻ�������Щ���
//		FilterType.ANNOTATION ����ע��
//		FilterType.ASSIGNABLE_TYPE ���ո���������
//		FilterType.ASPECTJ ʹ��ASPECTJ���ʽ
//		FilterType.REGEX ʹ��������ʽ
//		FilterType.CUSTOM ʹ���Զ������
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
