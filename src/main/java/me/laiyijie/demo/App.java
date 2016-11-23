package me.laiyijie.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.laiyijie.demo.service.UserService;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		UserService accountService = context.getBean(UserService.class);
		
		System.out.println(accountService.login("lailai", "laiyijie","127.0.0.1"));
		
		context.close();
	}
}
