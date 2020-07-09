package com.yws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yws.bean.Car;

@Configuration
public class MyConfigOfLifeCircle {

	@Bean(initMethod = "init", destroyMethod = "destory")
	public Car car() {
		return new Car();
	}
}
