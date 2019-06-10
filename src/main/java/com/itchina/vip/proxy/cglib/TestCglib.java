package com.itchina.vip.proxy.cglib;

public class TestCglib {
	public static void main(String[] args) {

		ZhangSan instance = (ZhangSan) new MeiPo().getInstance(new ZhangSan());
		instance.findLove();

	}

}
