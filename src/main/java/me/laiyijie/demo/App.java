package me.laiyijie.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.laiyijie.demo.service.UserService;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		UserService userService = context.getBean(UserService.class);
		
		System.out.println(userService.login("lailai", "laiyijie","127.0.0.1"));
		
		context.close();
	}
}
