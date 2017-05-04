package com.laowang.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 声明式事务管理，方式三
 * 基于注解
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class TestAccount {
	
	@Autowired//accountService这个bean在运行时已经事务增强了，本身就是代理了
	private AccountService accountService;
	
	@Test
	public void test1(){
		accountService.transfer("bbb", "aaa", 100);
		System.out.println("[ok]...");
	}
}
