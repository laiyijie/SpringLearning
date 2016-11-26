package me.laiyijie.demo.dataaccess;

import org.springframework.stereotype.Service;

public class AccountAccessImpl implements AccountAccess {

	public boolean isAccountExist(String username) {
		
		if ("laiyijie".equals(username)) {
			return true;
		}
		return false;
	}

	public void updateLastLoginTime(String username) {

	}

	public boolean isPasswordRight(String username, String password) {
		
		if ("laiyijie".equals(username)&&"123456".equals(password)) {
			return true;
		}
		return false;
	}

}
