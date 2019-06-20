package com.itchina.vip.aop.annotation.aspect;

public class AnnotationMemberManger {
	
	public Boolean addMemberManger(Member member) {
		System.out.println("添加用户");
		return true;
	}
	public  Boolean removeMemberManger(long id) throws Exception{
		System.out.println("删除用户");
       throw new Exception("自己抛出的异常");
	}
	public void modifyMemberManger(Member member) {
		System.out.println("修改用户");
	}
	public Boolean queryMemberManger(String loginName) {
		System.out.println("查询用户");
		return true;
	}

	
}
