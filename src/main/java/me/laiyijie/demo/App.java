package me.laiyijie.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.laiyijie.demo.service.HelloInterface;

public class App {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");

		HelloInterface hello = context.getBean(HelloInterface.class);

		for (int i = 0; i < 10; i++) {
			hello.sayHello(i);
		}

		Thread.sleep(10000);

		context.close();
	}
}
