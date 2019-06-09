package com.itchina.vip.factory.abstractfactoryPackage;

public class AbstractFactoryTest {
	public static void main(String[] args) {

		DefaultFactory defaultFactory = new DefaultFactory();
		System.out.println(defaultFactory.getCar());
		/**
		 * 1.调用abstractfactory的getCar(string name)方法
		 * 因为在子类factory种没有getCar(String name)方法，只有getCar()方法
		 * 2.因为abstractfactory，所以先定义一个defaultfactory实体类，继承abstractfactory，用于具体的实现逻辑
		 * */
		System.out.println(defaultFactory.getCar("benz"));

	}
}
