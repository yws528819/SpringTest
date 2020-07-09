package com.yws.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.yws.bean.RainBow;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

	
	/**
	 * AnnotationMetadata： 当前类的注解信息
	 * BeanDefinitionRegistry：BeanDefinition注册类；
	 * 		把所有需要添加到容器中的bean，
	 * 		调用BeanDefinitionRegistry.registerBeanDefinition手工注册进来
	 * 
	 */
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		boolean beanDefinition1 = registry.containsBeanDefinition("com.yws.bean.Red");
		boolean beanDefinition2 = registry.containsBeanDefinition("com.yws.bean.Yellow");
		if (beanDefinition1 && beanDefinition2) {
			//指定Bean定义信息，(Bean的类型...)
			BeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
			//注册一个bean,指定bean名 
			registry.registerBeanDefinition("rainBow", beanDefinition);
		}
		
	}

}
