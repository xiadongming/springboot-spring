package com.itchina.vip.factory.methodfactory;

import com.itchina.vip.factory.simplefactory.BMW;
import com.itchina.vip.factory.simplefactory.Car;

public class BMWFactory implements Factory{

	@Override
	public Car getCar() {
		return new BMW();
	}

}
