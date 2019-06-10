package com.itchina.vip.factory.abstractfactoryPackage;

import com.itchina.vip.factory.simplefactory.Car;

public class DefaultFactory extends AbstractFactory{

	private AudiFactory defaultFactory = new AudiFactory();
	
	
	@Override
	protected Car getCar() {

		return defaultFactory.getCar();
	}
	
/*	public Car getCar(String name) {
		
		return defaultFactory.getCar();
	}
*/
}
