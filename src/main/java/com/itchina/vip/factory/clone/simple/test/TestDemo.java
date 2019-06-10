package com.itchina.vip.factory.clone.simple.test;

import java.util.ArrayList;

public class TestDemo {

	public static void main(String[] args) {
		
		Person person = new Person();
		ArrayList<String> list = new ArrayList();
		list.add("123");
		person.setList(list);
		System.out.println(person.getList().get(0));
		
		
	}
	
}
