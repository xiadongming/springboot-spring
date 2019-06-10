package com.itchina.vip.factory.methodfactory;

public class FactoryTest {
	public static void main(String[] args) {

		Factory audiFactory = new AudiFactory();
		System.out.println(audiFactory.getCar());

		BENZFactory benzFactory = new BENZFactory();
		System.out.println(benzFactory.getCar());
	}

}
