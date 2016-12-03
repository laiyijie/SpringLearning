package me.laiyijie.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.laiyijie.demo.service.UserService;

public class App {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");

		UserService service = context.getBean(UserService.class);
		
		service.createAccount("laiyijie", "123123", "lai");
		
		service.createAccount("lailai", "123123", "lai");
		
		context.close();
	}

}
