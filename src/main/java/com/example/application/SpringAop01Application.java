package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan({"com.example.aspect", "com.example.controller", "com.example.model", "com.example.service"})
public class SpringAop01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAop01Application.class, args);
	}

}
