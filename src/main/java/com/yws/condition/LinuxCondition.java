package com.yws.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class LinuxCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//1.�ܻ�ȡ��iocʹ�õ�beanFactory
		context.getBeanFactory();
		
		//2.��ȡ�������
		ClassLoader classLoader = context.getClassLoader();

		//3.��ȡ��ǰ������Ϣ
		context.getEnvironment();
		
		//4.��ȡbean�����ע����
		BeanDefinitionRegistry registry = context.getRegistry();
		
		String osName = context.getEnvironment().getProperty("os.name");

		if (osName.contains("Linux")) {
			return true;
		}
		return false;
	}

}
