package com.laowang.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 声明式事务管理，方式一
 * 基于TransactionProxyFactoryBean
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class TestAccount {
	
	//注入业务bean,因为accountService没有aop功能，所以需要增强其功能
	//也即需要为其设置代理类，完成事务控制
//	@Autowired
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void test1(){
		accountService.transfer("bbb", "aaa", 100);
		System.out.println("[ok]...");
	}
}
