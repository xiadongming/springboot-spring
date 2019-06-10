package com.itchina.vip.factory.singleton;

public class LazySingleton {
	/**
	 * 懒汉式单例模式
	 **/

	// 使用private，用于单例模式
	private LazySingleton() {

	}

	private static LazySingleton lazySingleton = null;

	public static LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}

		return lazySingleton;
	}

}
