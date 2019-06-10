package com.itchina.vip.factory.simplefactory;

public class SimpleFactory {
	
	public Car getCar(String str) {
		if("bmw".equalsIgnoreCase(str)) {
			return new BMW();
		}else if("benz".equalsIgnoreCase(str)) {
			return new BENZ();
		}else if("AUDI".equalsIgnoreCase(str)) {
			return new Audi();
		}else {
			System.out.println("不能生产该种汽车");
		}
		return null;
	}

}
