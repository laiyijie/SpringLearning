package me.laiyijie.demo.service;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:root-context.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HelloInterFaceTest {

	@Autowired
	private HelloInterface helloInterface;

	@Before
	public void init() {
		System.out.println("init before every testcase");
	}

	@After
	public void after() {
		System.out.println("clean after every testcase");
	}

	@Test
	public void TS0101_sayHello_normal() {

		int num = 10;

		String result = helloInterface.sayHello(num);
		
		System.out.println(result);
		
		String expect = "the " + num + " time to say userHello";
		
		assertEquals(expect, result);
	}

	@Test
	public void TS0201_sayHelloWithTime_normal() {
		
		String result = helloInterface.sayHelloWithTime();
		
		System.out.println(result);
	}
}
