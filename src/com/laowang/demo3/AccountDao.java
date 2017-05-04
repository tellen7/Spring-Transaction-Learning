package com.laowang.demo3;
/**
 * 
 * 转账案例的DAO层
 * @author wangyonghao8
 *
 */
public interface AccountDao {
	/**
	 * @param out	:转出账号
	 * @param money	:转账金额
	 */
	public void outMoney(String out,double money);
	/**
	 * @param in	:转入账号
	 * @param money	:转账金额
	 */
	public void inMoney(String in,double money);
}
