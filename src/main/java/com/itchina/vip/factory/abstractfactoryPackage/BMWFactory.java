package com.itchina.vip.factory.abstractfactoryPackage;

import com.itchina.vip.factory.simplefactory.BMW;
import com.itchina.vip.factory.simplefactory.Car;

public class BMWFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		return new BMW();
	}

}
