package com.itchina.vip.aop.aspect.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itchina.vip.aop.aspect.AuthService;
import com.itchina.vip.aop.aspect.MemberManger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class AspectSpringTest {

	@Test
	public void getTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		AuthService authService = (AuthService)applicationContext.getBean("authService");
		authService.loginAuthService("111", "222");
	//	authService.loginoutAuthService("1111");
	}
	@Test
	public void testAfterReturn() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		MemberManger memberManger = (MemberManger)applicationContext.getBean("memberManger");
		memberManger.addMemberManger(null);//有返回值，应该是执行aop的，应该只能调afterreturn
		memberManger.modifyMemberManger(null);//无返回值，不应该执行aop的afterreturn才对，为什么执行了？？
	}
}





