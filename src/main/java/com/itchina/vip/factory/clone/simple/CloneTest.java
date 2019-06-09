package com.itchina.vip.factory.clone.simple;

public class CloneTest {
	public static void main(String[] args) {

		ConcretePrototypr cp = new ConcretePrototypr();
		cp.setAge("123");
		try {
			ConcretePrototypr copy = (ConcretePrototypr) cp.clone();
			System.out.println(cp.list == copy.list);//浅拷贝时：true，说明是一个引用
			                                         //深拷贝时：false，说明是两个引用
			System.out.println(cp.age == copy.age);//true，说明是一个引用
			
			
			System.out.println(cp == copy);//false,说明是两个对象，两个引用
			System.out.println(copy.getAge());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
