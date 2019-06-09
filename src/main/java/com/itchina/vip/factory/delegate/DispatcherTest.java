package com.itchina.vip.factory.delegate;

public class DispatcherTest  {

	public static void main(String[] args) {
		
		Dispatcher dispatcher = new Dispatcher(new ExectorA());
		dispatcher.doing();
		
		
	}

}
