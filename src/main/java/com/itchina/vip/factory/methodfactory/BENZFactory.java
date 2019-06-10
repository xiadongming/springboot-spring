package com.itchina.vip.factory.methodfactory;

import com.itchina.vip.factory.simplefactory.BENZ;
import com.itchina.vip.factory.simplefactory.Car;

public class BENZFactory implements Factory{

	@Override
	public Car getCar() {
		return new BENZ();
	}

}
