package com.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import org.aspectj.lang.JoinPoint;

@Aspect
@Component
public class EmployeeServiceAspect {
	
	//execution(expression) --> a method on which advice is to be applied
	//@Before --> marks a function as an advice to be executed before a method that matches with the poointcut expression
	@Before(value="execution(* com.example.service.EmployeeService.*(..)) and args(empId, fname, sname)")
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {
		
		System.out.println("Before method: " + joinPoint.getSignature());
		System.out.println("Creating Employee with first name - " + fname + ", second name- " + sname + " and id- " + empId);
		
	}
	
	//@After --> marks a function as an advice to be executed after a method that matches with the pointcut expression
	@After(value="execution(* com.example.service.EmployeeService.*(..)) and args(empId,fname, sname)")
	public void afterAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {
		
		System.out.println("After method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with first name- " + fname + ", second name-" + sname + " and id-" + empId);
		
	}
	
	
}
