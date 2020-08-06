package com.yws.ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yws.bean.Blue;

@ComponentScan(value="com.yws.ext")
@Configuration
public class MyConfigExt {
	@Bean
	public Blue blue() {
		return new Blue();
	}
}
