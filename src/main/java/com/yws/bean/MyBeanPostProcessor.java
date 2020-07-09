package com.yws.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
/**
 * 后置处理器，初始化前后进行处理工作
 * 将后置处理器加入到容器中
 * 
 * BeanPostProcessor原理
 * populateBean(beanName, mbd, instanceWrapper);
 * initializeBean
 * {
 * 	applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
 *  invokeInitMethods(beanName, wrappedBean, mbd);//执行类自定义的初始化
 *  applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
 * }
 * 
 * 
 * 
 * ApplicationContextAwareProcessor
 * BeanValidationPostProcessor
 * AutowiredAnnotationBeanPostProcessor
 * InitDestroyAnnotationBeanPostProcessor
 * 
 * @author mayn
 *
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization..." + bean);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization..." + bean);
		return bean;
	}

}
