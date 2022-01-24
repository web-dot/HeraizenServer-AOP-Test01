package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Employee;

@Service
public class EmployeeService {
	
	public Employee createEmployee(String empid, String fname, String sname) {
		
		Employee emp = new Employee();
		emp.setEmpId(empid);
		emp.setFirstName(fname);
		emp.setSecondName(sname);
		
		return emp;
	}
	
	
	public void deleteEmployee(String empid) {
		
		
		
	}
	
	
	
	
}
