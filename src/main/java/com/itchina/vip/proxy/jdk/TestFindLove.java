package com.itchina.vip.proxy.jdk;

import java.io.FileOutputStream;

import sun.misc.ProxyGenerator;

public class TestFindLove {

	public static void main(String[] args) {

		//将子类引用指向父类(接口)
		Person obj = (Person) new MeiPo().getInstance(new ZhangSan());
		obj.findLove();
		System.out.println(obj.getClass());// obj�Ǵ�����󣬲���ZhangSan�������

		/***
		 * obj�Ǵ����࣬���������ɵ�һ���࣬��ZhangSan����һ����
		 */
		/**
		 * һ������$��ͷ��һ�㶼�Ǵ�����
		 * **/
		//��ȡ�ֽ�������
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
