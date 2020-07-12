package com.yws.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yws.bean.Car;
import com.yws.bean.Color;

@Configuration
@ComponentScan("com.yws.bean")
public class MyConfigOfAutowired {

	/**
	 * @Bean标注的方法创建对象的时候，方法参数的值从容器中获取
	 * @param car
	 * @return
	 */
	@Bean
	public Color color(/*@Autowired* 默认不写*/Car car) {
		Color color = new Color();
		color.setCar(car);
		return color;
	}
}
