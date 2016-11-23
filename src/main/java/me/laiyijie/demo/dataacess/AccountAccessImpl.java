package me.laiyijie.demo.dataacess;

import me.laiyijie.demo.dataobject.Account;

public class AccountAccessImpl implements AccountAcess {
	
	public Account getAccountByUsername(String username) {		
		//先不接数据库，简单写几个假数据，应当是写写SQl，操作操作数据库
		Account acc=  new Account();
		if (username == "laiyijie"){
			acc.setPassword("123456");
			acc.setLastLoginTime(System.currentTimeMillis());
			acc.setUsername("laiyijie");
			return acc;
		}else{
			acc.setPassword("123123");
			acc.setLastLoginTime(System.currentTimeMillis());
			acc.setUsername("notlaiyijie");
			return acc;
		}
	}

	public Account createAccount(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean checkPassword(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
