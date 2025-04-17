package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IServiceManagement {
	
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> fetchAllRecord();

}
