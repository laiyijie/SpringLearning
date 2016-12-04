package me.laiyijie.demo.service;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private BasicDataSource dataSource;

	@Transactional(rollbackFor={Exception.class})
	public void createAccount(String username, String password, String name) throws Exception {

		Connection connection = DataSourceUtils.getConnection(dataSource);

		connection.createStatement().execute("INSERT INTO account (username, password, name,create_time) VALUES('"
				+ username + "','" + password + "','" + name + "','" + System.currentTimeMillis() + "')");

		if (username == "lailai") {
			throw new RuntimeException("lailai");
		}

		connection.createStatement()
				.execute("INSERT INTO pocket (username,current_money) VALUES('" + username + "','" + 0 + "')");

	}

}