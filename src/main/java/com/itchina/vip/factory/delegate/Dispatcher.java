package com.itchina.vip.factory.delegate;

public class Dispatcher implements IExector {

	IExector iExector;

	public Dispatcher(IExector iExector) {
		this.iExector = iExector;
	}
	
	@Override
	public void doing() {
      this.iExector.doing();
	}

}
