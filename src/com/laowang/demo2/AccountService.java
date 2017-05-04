package com.laowang.demo2;
/**
 * 转账案例的业务层接口
 * @author wangyonghao8
 *
 */
public interface AccountService {
	/**
	 * @param in 	:转入帐号
	 * @param out	:转出账号
	 * @param money	:转账金额
	 */
	public void transfer(String in,String out,double money);
}
