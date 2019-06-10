package com.itchina.vip.factory.clone.template;

public class Coffee extends Bevegrage {

	@Override
	public void addCoundiments() {
		System.out.println("添加咖啡辅料");
	}

	@Override
	public void pourInCup() {

		System.out.println("添加咖啡主料");

	}

}
