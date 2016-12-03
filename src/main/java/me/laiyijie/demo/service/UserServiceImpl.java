package me.laiyijie.demo.service;

import java.sql.Connection;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.laiyijie.demo.dao.AccountMapper;
import me.laiyijie.demo.dao.PocketMapper;
import me.laiyijie.demo.domain.Account;
import me.laiyijie.demo.domain.Pocket;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private BasicDataSource dataSource;
	@Autowired
	private PocketMapper pocketMapper;
	@Autowired
	private AccountMapper accountMapper;
	@Transactional
	public void createAccount(String username, String password, String name) throws Exception {

		Connection connection = DataSourceUtils.getConnection(dataSource);

		String insertAccountSql = "INSERT INTO account (username, password, name,create_time) VALUES('" + username
				+ "','" + password + "','" + name + "','" + System.currentTimeMillis() + "')";
		String insertPocketSql = "INSERT INTO pocket (username,current_money) VALUES('" + username + "','" + 0 + "')";
		Statement statement = connection.createStatement();
		statement.execute(insertAccountSql);
		
		System.out.println("afther account sql");
		if (username == "lailai") {
			throw new RuntimeException("lailai");
		}

		statement.execute(insertPocketSql);
		
		System.out.println("afther POCKET sql");
	}
	
	@Transactional
	public void createAcc(String username, String password, String name) throws Exception {
		Account account = new Account();
		
		account.setCreate_time(System.currentTimeMillis());
		account.setName(name);
		account.setPassword(password);
		account.setUsername(username);

		accountMapper.insert(account);
		
		System.out.println("afther account insert");
		
		if (username == "lailai") {
			throw new RuntimeException("lailai");
		}
		Pocket pocket = new Pocket();
		pocket.setCurrent_money(0);
		pocket.setUsername(username);
		
		pocketMapper.insert(pocket);

	}
	
	
	@Transactional
	public void createAccou(String username, String password, String name) throws Exception {
		
		JdbcTemplate jTemplate = new JdbcTemplate(dataSource);

		String insertAccountSql = "INSERT INTO account (username, password, name,create_time) VALUES('" + username
				+ "','" + password + "','" + name + "','" + System.currentTimeMillis() + "')";
		String insertPocketSql = "INSERT INTO pocket (username,current_money) VALUES('" + username + "','" + 0 + "')";
		
		jTemplate.execute(insertAccountSql);
		
		System.out.println("afther account sql");
		if (username == "lailai") {
			throw new RuntimeException("lailai");
		}

		jTemplate.execute(insertPocketSql);
		
		System.out.println("afther POCKET sql");
		
	}
}