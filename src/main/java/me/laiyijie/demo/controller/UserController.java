package me.laiyijie.demo.controller;

import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/hi")
	@ResponseBody
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		return "hello " + name;
	}

	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession httpsession) {
		if ("laiyijie".equals(username) && "lailai".equals(password)) {
			httpsession.setAttribute("username", username);
			return "login success";
		}
		return "loging failed";
	}

}
