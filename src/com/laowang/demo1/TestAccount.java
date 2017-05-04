package com.laowang.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 编程式事务管理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAccount {
	
	//
	@Autowired
	private AccountService accountService;
	
	@Test
	public void test1(){
		//a给b转账100元
		accountService.transfer("aaa", "bbb", 900);
		System.out.println("[ok]...");
	}
}
