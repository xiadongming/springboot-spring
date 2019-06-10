package com.itchina.vip.factory.abstractfactoryPackage;

import com.itchina.vip.factory.simplefactory.Car;

public abstract class AbstractFactory {

	protected abstract Car getCar();

	public Car getCar(String str) {
		if ("bmw".equalsIgnoreCase(str)) {
			return new BMWFactory().getCar();
		} else if ("benz".equalsIgnoreCase(str)) {
			return new BENZFactory().getCar();
		} else if ("AUDI".equalsIgnoreCase(str)) {
			return new AudiFactory().getCar();
		} else {
			System.out.println("不能生产该种汽车");
		}
		return null;
	}

}
