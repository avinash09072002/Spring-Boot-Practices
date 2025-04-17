package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class ServiceImplementaion implements IServiceManagement {
	
	@Autowired
	 private IEmployeeRepository repository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		Employee employee2=repository.save(employee);
		  
		return employee2;
	}
	@Override
	public List<Employee> fetchAllRecord() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
