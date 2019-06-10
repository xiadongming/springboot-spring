package com.itchina.vip.factory.clone.simple;

import java.util.ArrayList;

public class Prototype implements Cloneable{

	public ArrayList<String> list = new ArrayList();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype prototype = null;
		
		prototype = (Prototype)super.clone();
		prototype.list = (ArrayList<String>)list.clone();
		return prototype;//深拷贝
		//return super.clone();//直接返回，是浅拷贝
	}

}
