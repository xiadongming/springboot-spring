package com.itchina.vip.factory.clone.template;

public abstract class BevegrageTest {
	public static void main(String[] args) {

		Coffee coffee = new Coffee();
		coffee.create();
		System.out.println("=================");

		Tea tea = new Tea();
		tea.create();
	}
}
