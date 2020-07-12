package com.yws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.yws.bean.MathAspect;
import com.yws.bean.MathCaculator;

@EnableAspectJAutoProxy
@Configuration
public class MyConfigOfAop {

	@Bean
	public MathCaculator mathCaculator() {
		return new MathCaculator();
	}
	
	@Bean
	public MathAspect mathAspect() {
		return new MathAspect();
	}
}
