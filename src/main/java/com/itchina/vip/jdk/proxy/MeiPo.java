package com.itchina.vip.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MeiPo implements InvocationHandler{

	private Person target;
	
	public Object getInstance(Person target) {
		this.target = target;
		Class clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		target.findLove();
		System.out.println(proxy.getClass());//proxy是代理对象
		System.out.println(target);
		//System.out.println(proxy.toString());//栈溢出
		System.out.println(method.getName());
		//System.out.println(args.toString());//空指针
		return null;
	}

}
