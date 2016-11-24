package me.laiyijie.demo.service;

import me.laiyijie.demo.dataaccess.AccountAccess;
import me.laiyijie.demo.dataaccess.LoginLogAccess;

public class UserServiceImpl implements UserService {

	private AccountAccess accountAccess;
	
	private LoginLogAccess loginLogAccess;
	
	public boolean login(String username, String password,String ip) {
		
		if (!accountAccess.isAccountExist(username)) {
			return false;
		}
		
		if (accountAccess.isPasswordRight(username, password)) {
			accountAccess.updateLastLoginTime(username);
			loginLogAccess.addLoginLog(username, ip);
			return true;
		}
		return false;
	}

	public AccountAccess getAccountAccess() {
		return accountAccess;
	}

	public void setAccountAccess(AccountAccess accountAccess) {
		this.accountAccess = accountAccess;
	}

	public LoginLogAccess getLoginLogAccess() {
		return loginLogAccess;
	}

	public void setLoginLogAccess(LoginLogAccess loginLogAccess) {
		this.loginLogAccess = loginLogAccess;
	}
}
