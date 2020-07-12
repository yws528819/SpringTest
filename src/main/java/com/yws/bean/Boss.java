package com.yws.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {

	//构造器要用的组件，也是从容器中获取
	//1.@Autowired
	public Boss(/*2.@Autowired 3.去掉*/ Car car) {
		this.car = car;
	}
	
	
	private Car car;

	public Car getCar() {
		return car;
	}

	//0.@Autowired
	//标在方法上，Spring容器创建当前对象，就会调用该方法，完成赋值
	//方法使用的参数，自定义类型的值从IOC容器中获取
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Boss [car=" + car + "]";
	}
	
	
}
