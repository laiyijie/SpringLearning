package me.laiyijie.demo.service;

import java.util.List;

import me.laiyijie.demo.domain.Account;

public interface UserService {
	Account createAccount(String username ,String password,String name);
	List<Account> getAccountsByCreateTime(Long start,Long end);
}
