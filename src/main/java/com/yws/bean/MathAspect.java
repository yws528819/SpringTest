package com.yws.bean;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MathAspect {
	
	@Pointcut("execution(public int com.yws.bean.MathCaculator.*(..))")
	public void pointCut() {
		
	}
	
	@Before(value = "pointCut()")
	public void logStart(JoinPoint jPoint) {
		Object[] args = jPoint.getArgs();
		String name = jPoint.getSignature().getName();
		System.out.println("除数方法" + name + "开始前，参数：" + Arrays.asList(args));
	}
	
	@After(value = "com.yws.bean.MathAspect.pointCut()")
	public void logEnd() {
		System.out.println("除数方法开始后...");
	}
	
	@AfterReturning(value = "pointCut()", returning = "result")
	public void logReurning(JoinPoint jPoint, Object result) {
		System.out.println("除数方法返回：" + result);
	}
	
	@AfterThrowing(value = "pointCut()", throwing = "exception")
	public void logException(JoinPoint jPoint, Exception exception) {
		System.out.println("除数方法异常：" + exception);
	}
}
