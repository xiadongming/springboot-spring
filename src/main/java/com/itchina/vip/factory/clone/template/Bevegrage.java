package com.itchina.vip.factory.clone.template;

public abstract class Bevegrage {

	public final void create() {
		// 烧水，通用步骤
		boilWater();
		// 放原料，不同的人和不同的类型
		pourInCup();
		// 开水冲泡，通用步骤
		brew();
		// 添加辅料，不同人喜欢不同的类型
		addCoundiments();

	}

	public abstract void addCoundiments();

	public abstract void pourInCup();

	private void brew() {
		System.out.println("用开水冲泡");
	}

	private void boilWater() {

		System.out.println("烧开水");

	}

}
