package com.example.application;

import org.springframework.boot.SpringApplication;
import com.example.service.BankService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
//@EnableAspectJAutoProxy annotation enables support for handlinf the components marked with @Aspect annotation.
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({"com.example.aspect", "com.example.controller", "com.example.model", "com.example.service"})
public class SpringAop01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringAop01Application.class, args);
		
		
		//Fetching the bank object from application context
		BankService bank = context.getBean(BankService.class);
		
		//Displaying balance in the account
		String accnumber = "12345";
		
		bank.displayBalance(accnumber);
		
		
		
		//closing context object
		context.close();
		
		
		
		
		
		
		
		
		
	}

	
}
