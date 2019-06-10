package com.itchina.vip.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MeiPo implements MethodInterceptor{

	public Object getInstance(Object obj) {
		Enhancer enh = new Enhancer();
		//把父类设置为obj，，告诉cglib，生成的子类继承obj这个父类
		enh.setSuperclass(obj.getClass());
		enh.setCallback(this);
		return enh.create();
	}
	/**
	 * obj是生成的子类,这个obj是cglib给new出来的
	 * new出来的额这个对象obj，是被代理的子类，继承了我们自己写的这个类ZhangSan
	 * 在new子类之前，实际上先调用了我们的super()方法即ZhangSan的方法
	 * 在new子类的同时，必须先new父类，相当于间接持有了我们的父类的引用，
	 * 子类重写父类所有的方法，
	 * 改变子类对象的属性，是可以间接操作父类的属性的
	 * **/
	@Override
	public Object intercept(Object obj, Method method, Object[] arg, MethodProxy proxyMethod) throws Throwable {
		proxyMethod.invokeSuper(obj, arg);
		System.out.println("obj.getClass()===="+obj.getClass());//ZhangSan
		System.out.println("proxy.getClass()===="+proxyMethod.getClass());//MethodProxy
		System.out.println("method===="+method);//findLove
		return null;
	}

}
