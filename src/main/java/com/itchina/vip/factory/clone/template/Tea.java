package com.itchina.vip.factory.clone.template;

public class Tea extends Bevegrage {

	@Override
	public void addCoundiments() {
		System.out.println("添加茶辅料");
	}

	@Override
	public void pourInCup() {

		System.out.println("添加茶主料");

	}

}
