package com.laowang.demo2;


/**
 *转账案例的service接口实现类
 */
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	public void transfer1(String in, String out, double money) {
		accountDao.outMoney(out, money);
		accountDao.inMoney(in, money);
	}
	
	@Override
	public void transfer(String in, String out, double money) {
		
				accountDao.outMoney(out, money);
				//int a= 1/0;//测试事务回滚
				accountDao.inMoney(in, money);
		
	}

}
