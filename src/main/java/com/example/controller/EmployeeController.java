package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/add/employee", method=RequestMethod.GET)
	public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam String firstName, @RequestParam String secondName) {
		
		return employeeService.createEmployee(empId, firstName, secondName);
		
	}
	
	
	@RequestMapping(value="/remove/employee")
	public String removeEmployee(@RequestParam("empId") String empid) {
		
		employeeService.deleteEmployee(empid);
		return "Employee removed";
	}
	
}
