package com.itchina.vip.factory.singleton;

public class LazySingleton {
	/**
	 * ����ʽ����ģʽ
	 **/

	// ʹ��private�����ڵ���ģʽ
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
