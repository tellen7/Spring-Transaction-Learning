package com.laowang.demo4;

import org.springframework.transaction.annotation.Transactional;


/**
 *转账案例的service接口实现类
 */

/**
 * @Transactional 属性说明
 * 		propagation		:事务的传播行为
 * 		isolation		:事务的隔离级别
 *		readOnly		:只读（不允许增删改）
 *		rollbackFor		:发生哪些异常回滚
 *		noRollbackFor	:发生哪些异常不回滚
 */
@Transactional
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
//				int a= 1/0;//测试事务回滚
				accountDao.inMoney(in, money);
		
	}

}
