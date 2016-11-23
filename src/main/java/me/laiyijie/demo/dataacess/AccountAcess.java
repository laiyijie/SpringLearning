package me.laiyijie.demo.dataacess;

import me.laiyijie.demo.dataobject.Account;

public interface AccountAcess {
	Account getAccountByUsername(String username);

	Account createAccount(String username, String password);

	boolean checkPassword(String username, String password);
}
