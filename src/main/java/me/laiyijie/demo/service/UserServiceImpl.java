package me.laiyijie.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements HelloInterface {

	public String sayHello(int i) {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "the " + i + " time to say " + "userHello";
	}

	public String sayHelloWithTime() {

		return "time:" + System.currentTimeMillis() + " userHello";
		
	}

}
