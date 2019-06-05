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
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		target.findLove();
		method.invoke(this.target, args);// 利用反射进行调用
		//method.invoke(proxy, args);// 利用反射进行调用,必须是target，反射也是taget找到内存中的代理对象，进行调用
		/**
		 * invoke是反射机制中的方法，method.invoke(owner,args);
		 * 执行该Method.invoke方法的参数是执行这个方法的对象owner，和参数数组args，
		 * 可以这么理解：owner对象中带有参数args的method方法。返回值是Object，也既是该方法的返回值。
		 **/
		System.out.println("=============");
		System.out.println(proxy.getClass());// proxy是代理对象
		System.out.println(target);
		// System.out.println(proxy.toString());//栈溢出
		System.out.println(method.getName());
		// System.out.println(args.toString());//空指针
		return null;
	}
}
