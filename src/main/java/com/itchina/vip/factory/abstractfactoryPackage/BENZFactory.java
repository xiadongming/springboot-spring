package com.itchina.vip.factory.abstractfactoryPackage;

import com.itchina.vip.factory.simplefactory.BENZ;
import com.itchina.vip.factory.simplefactory.Car;

public class BENZFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		return new BENZ();
	}

}
