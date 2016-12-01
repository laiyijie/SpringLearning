package me.laiyijie.demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.laiyijie.demo.domain.Account;
import me.laiyijie.demo.service.UserService;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");

		UserService service = context.getBean(UserService.class);

		Account account = service.createAccount("laiyijie", "123456", "赖赖");

		System.out.println(account);

		List<Account> accounts = service.getAccountsByCreateTime(0L, System.currentTimeMillis());

		for (Account account2 : accounts) {
			System.out.println(account2);
		}

		context.close();
	}

}
