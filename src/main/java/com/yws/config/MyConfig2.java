package com.yws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.yws.bean.Color;
import com.yws.bean.ColorFactoryBean;
import com.yws.bean.Person;
import com.yws.bean.Red;
import com.yws.condition.LinuxCondition;
import com.yws.condition.WindowsCondition;

@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
//@Import导入组件，id默认是组件的全类名
public class MyConfig2 {
	
	@Conditional({LinuxCondition.class})
	@Bean("linus")
	public Person person1() {
		return new Person(48, "Linus");
	}
	
	@Conditional({WindowsCondition.class})
	@Bean("Bill")
	public Person person2() {
		return new Person(60, "Bill");
	}
	
	@Bean
	public ColorFactoryBean colorFactoryBean() {
		return new ColorFactoryBean();
	}
}
