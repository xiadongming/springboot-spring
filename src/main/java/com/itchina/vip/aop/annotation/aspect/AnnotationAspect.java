package com.itchina.vip.aop.annotation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect//这个类声明为切面的类
public class AnnotationAspect {
	
	//声明切点
	@Pointcut("execution(* com.itchina.vip.aop.annotation.aspect..*(..))")
	public void pointCutConfig() {}
	
	@Before("pointCutConfig()")
	public void beforeLogAspect(JoinPoint joinPoint) {
		System.out.println("执行之前调用    "+joinPoint);
	}
	@After("pointCutConfig()")
	public void afterLogAspect(JoinPoint joinPoint) {
		System.out.println("执行之後执行    "+joinPoint);
		System.out.println(joinPoint.getKind());
	}
	@AfterReturning("pointCutConfig()")
	public void afterReturnLogAspect(JoinPoint joinPoint) {
		System.out.println("执行之後执行,有返回值    "+joinPoint);
	}
	@AfterThrowing("pointCutConfig()")
	public void afterthrowLogAspect(JoinPoint joinPoint) {
		System.out.println("抛出异常之后执行   "+joinPoint);
		System.out.println(joinPoint.getTarget());
		System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getSourceLocation());
        System.out.println(joinPoint.getStaticPart());
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getArgs());
		 
	}

}
