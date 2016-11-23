package me.laiyijie.demo.dataaccess;

public interface AccountAccess {
	
	boolean isAccountExist(String username);

	boolean isPasswordRight(String username, String password);
	
	void updateLastLoginTime(String username);
}
