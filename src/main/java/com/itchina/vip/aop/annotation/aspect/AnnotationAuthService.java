package com.itchina.vip.aop.annotation.aspect;


public class AnnotationAuthService {

	public Member loginAuthService(String loginName,String passWord) {
		System.out.println("用户登录");
		
		return new Member();
	}		
	
	public Boolean loginoutAuthService(String loginName) {
		System.out.println("注销登陆");
		
		return true;
	}		
	
	
	
}
