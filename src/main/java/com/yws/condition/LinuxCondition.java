package com.yws.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class LinuxCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//1.能获取到ioc使用的beanFactory
		context.getBeanFactory();
		
		//2.获取类加载器
		ClassLoader classLoader = context.getClassLoader();

		//3.获取当前环境信息
		context.getEnvironment();
		
		//4.获取bean定义的注册类
		BeanDefinitionRegistry registry = context.getRegistry();
		
		String osName = context.getEnvironment().getProperty("os.name");

		if (osName.contains("Linux")) {
			return true;
		}
		return false;
	}

}
