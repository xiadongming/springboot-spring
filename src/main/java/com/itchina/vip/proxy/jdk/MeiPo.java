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
      * �����������ִ��Proxy.newProxyInstance�Զ�ִ�еģ�proxy�Ǵ������$proxy0,method��findLove������
      * ����������ڴ������proxy��proxy0ִ�еĹ�����ִ�еģ������invoke�У�ʹ��method.invoke(proxy,args),�����ջ�������ѭ��
      * (��Ϊmethod.invoke(proxy,args)���Ǵ���ִ��Ŀ�귽������Proxy.newProxyInstance()��ͬ����һֱ����invoke��������ѭ��)
      * **/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		target.findLove();
		/**
		 * proxy = this.target; 
		 * method.invoke(proxy, args);
		 * ͬ��Ҳ���ԣ��������ø�ֵ���������proxy
		 **/
		System.out.println("********");
		method.invoke(this.target, args);// ���÷�����е���
		// method.invoke(proxy, args);// ���÷�����е���,������target������Ҳ��taget�ҵ��ڴ��еĴ�����󣬽��е���
		/**
		 * invoke�Ƿ�������еķ�����method.invoke(owner,args);
		 * ִ�и�Method.invoke�����Ĳ�����ִ����������Ķ���owner���Ͳ�������args��
		 * ������ô��⣺owner�����д��в���args��method����������ֵ��Object��Ҳ���Ǹ÷����ķ���ֵ��
		 **/
		System.out.println("=============");
		System.out.println("proxy.getClass()======"+proxy.getClass());//proxy0
		System.out.println("target===="+target);//ZhangSan
		// System.out.println(proxy.toString());//ջ���
		System.out.println(method.getName());
		return null;
	}
}
