package com.itchina.vip.factory.abstractfactoryPackage;

public class AbstractFactoryTest {
	public static void main(String[] args) {

		DefaultFactory defaultFactory = new DefaultFactory();
		System.out.println(defaultFactory.getCar());
		/**
		 * 1.����abstractfactory��getCar(string name)����
		 * ��Ϊ������factory��û��getCar(String name)������ֻ��getCar()����
		 * 2.��Ϊabstractfactory�������ȶ���һ��defaultfactoryʵ���࣬�̳�abstractfactory�����ھ����ʵ���߼�
		 * */
		System.out.println(defaultFactory.getCar("benz"));

	}
}
