package com.itchina.vip.jdk.proxy;

public class TestFindLove {

	public static void main(String[] args) {

		Person obj = (Person) new MeiPo().getInstance(new ZhangSan());
		obj.findLove();
        System.out.println(obj.getClass());//obj�Ǵ�����󣬲���ZhangSan�������
        
        /***
         * obj�Ǵ����࣬���������ɵ�һ���࣬��ZhangSan����һ����
         * */
        
        
	}

}
