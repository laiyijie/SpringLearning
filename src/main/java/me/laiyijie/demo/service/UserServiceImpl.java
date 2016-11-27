package me.laiyijie.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements HelloInterface {

	public void sayHello() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("userHello");
	}
	
}
