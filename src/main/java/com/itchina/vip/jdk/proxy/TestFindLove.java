package com.itchina.vip.jdk.proxy;

public class TestFindLove {

	public static void main(String[] args) {

		Person obj = (Person) new MeiPo().getInstance(new ZhangSan());
		obj.findLove();
        System.out.println(obj.getClass());//obj是代理对象，不是ZhangSan这个对象
        
        /***
         * obj是代理类，是重新生成的一个类，和ZhangSan不是一个类
         * */
        
        
	}

}
