	package me.laiyijie.demo;
	
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	import me.laiyijie.demo.service.AccountService;
	
	/**
	 * Hello
	 *
	 */
	public class App {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
	
			AccountService accountService = context.getBean(AccountService.class);
	
			System.out.println(accountService.sayHello());
	
			context.close();
		}
	}
