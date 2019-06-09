package com.itchina.vip.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MeiPo implements InvocationHandler {
	private Person target;

	public Object getInstance(Person target) {
		this.target = target;
		Class clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
     /**
      * 这个方法是在执行Proxy.newProxyInstance自动执行的，proxy是代理对象$proxy0,method是findLove方法，
      * 这个方法是在代理对象proxy即proxy0执行的过程中执行的，如果在invoke中，使用method.invoke(proxy,args),会造成栈溢出，死循环
      * (因为method.invoke(proxy,args)还是代理执行目标方法，和Proxy.newProxyInstance()相同，会一直调用invoke方法，死循环)
      * **/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		target.findLove();
		/**
		 * proxy = this.target; 
		 * method.invoke(proxy, args);
		 * 同样也可以，，将引用赋值给代理对象proxy
		 **/
		System.out.println("********");
		method.invoke(this.target, args);// 利用反射进行调用
		// method.invoke(proxy, args);// 利用反射进行调用,必须是target，反射也是taget找到内存中的代理对象，进行调用
		/**
		 * invoke是反射机制中的方法，method.invoke(owner,args);
		 * 执行该Method.invoke方法的参数是执行这个方法的对象owner，和参数数组args，
		 * 可以这么理解：owner对象中带有参数args的method方法。返回值是Object，也既是该方法的返回值。
		 **/
		System.out.println("=============");
		System.out.println("proxy.getClass()======"+proxy.getClass());//proxy0
		System.out.println("target===="+target);//ZhangSan
		// System.out.println(proxy.toString());//栈溢出
		System.out.println(method.getName());
		return null;
	}
}
