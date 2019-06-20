package com.itchina.vip.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class LogAspect {
	
	public void beforeLogAspect(JoinPoint joinPoint) {
		System.out.println("执行之前调用    "+joinPoint);
	}
	public void afterLogAspect(JoinPoint joinPoint) {
		System.out.println("执行之後执行    "+joinPoint);
	}
	public void afterReturnLogAspect(JoinPoint joinPoint) {
		System.out.println("执行之後执行,有返回值    "+joinPoint);
	}
	public void afterthrowLogAspect(JoinPoint joinPoint) {
		System.out.println("抛出异常之后执行   "+joinPoint);
	}

}
