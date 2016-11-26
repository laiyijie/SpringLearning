package me.laiyijie.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.laiyijie.demo.dataaccess.AccountAccess;
import me.laiyijie.demo.dataaccess.LoginLogAccess;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private AccountAccess accountAccess;
	@Autowired
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
}
