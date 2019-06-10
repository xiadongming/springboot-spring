package com.itchina.vip.factory.simplefactory;

public class SimpleFactoryTest {
	public static void main(String[] args) {

		Car car = new SimpleFactory().getCar("bmw");
		System.out.println(car.getName());
	}

}
