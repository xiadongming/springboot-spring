package com.itchina.vip.proxy.jdk;

import java.io.FileOutputStream;

import sun.misc.ProxyGenerator;

public class TestFindLove {

	public static void main(String[] args) {

		Person obj = (Person) new MeiPo().getInstance(new ZhangSan());
		obj.findLove();
		System.out.println(obj.getClass());// obj是代理对象，不是ZhangSan这个对象

		/***
		 * obj是代理类，是重新生成的一个类，和ZhangSan不是一个类
		 */
		/**
		 * 一个类已$开头，一般都是代理类
		 * **/
		//获取字节码内容
		byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] { obj.getClass() });
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("D:\\00-proxy\\$Proxy03.class");
			fos.write(data);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
