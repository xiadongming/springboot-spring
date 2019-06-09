package com.itchina.vip.factory.abstractfactoryPackage;

import com.itchina.vip.factory.simplefactory.Audi;
import com.itchina.vip.factory.simplefactory.Car;

public class AudiFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
