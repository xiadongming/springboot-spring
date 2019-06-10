package com.itchina.vip.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MeiPo implements MethodInterceptor{

	public Object getInstance(Object obj) {
		Enhancer enh = new Enhancer();
		//�Ѹ�������Ϊobj��������cglib�����ɵ�����̳�obj�������
		enh.setSuperclass(obj.getClass());
		enh.setCallback(this);
		return enh.create();
	}
	/**
	 * obj�����ɵ�����,���obj��cglib��new������
	 * new�����Ķ��������obj���Ǳ���������࣬�̳��������Լ�д�������ZhangSan
	 * ��new����֮ǰ��ʵ�����ȵ��������ǵ�super()������ZhangSan�ķ���
	 * ��new�����ͬʱ��������new���࣬�൱�ڼ�ӳ��������ǵĸ�������ã�
	 * ������д�������еķ�����
	 * �ı������������ԣ��ǿ��Լ�Ӳ�����������Ե�
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
