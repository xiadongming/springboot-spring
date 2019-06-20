package com.itchina.vip.aop.aspect;


public class AuthService {

	public void loginAuthService(String loginName,String passWord) {
		System.out.println("用户登录");
	}		
	
	public Boolean loginoutAuthService(String loginName) {
		System.out.println("注销登陆");
		
		return true;
	}		
	
	
	
}
