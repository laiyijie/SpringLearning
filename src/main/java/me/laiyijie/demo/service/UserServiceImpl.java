package me.laiyijie.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements HelloInterface {

	@Async
	public void sayHello(int i) {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("the " + i + " time to say " + "userHello");
	}

	@Scheduled(fixedDelay = 1000)
	public void sayHelloEverySecondes() {

		System.out.println("time:" + System.currentTimeMillis() + " userHello");
	}

}
