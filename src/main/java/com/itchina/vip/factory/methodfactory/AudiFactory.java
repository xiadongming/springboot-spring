package com.itchina.vip.factory.methodfactory;

import com.itchina.vip.factory.simplefactory.Audi;
import com.itchina.vip.factory.simplefactory.Car;

public class AudiFactory implements Factory{

	@Override
	public Car getCar() {
		return new Audi();
	}

}
