package com.itchina.vip.factory.singleton;

public class HungrySingleton {
	
	private HungrySingleton() {
		
	}
    private static HungrySingleton hungrySingleton = new HungrySingleton();
	
	public static HungrySingleton getInstance() {
		
		return hungrySingleton;
	}
	
}
