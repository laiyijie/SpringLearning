package me.laiyijie.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hello(){
		return "hello";
	}
	
}
