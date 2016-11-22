package me.laiyijie.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import me.laiyijie.demo.service.HelloInterface;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");

		HelloInterface accountService = context.getBean(HelloInterface.class);

		System.out.println(accountService.sayHello());

		context.close();
	}
}
